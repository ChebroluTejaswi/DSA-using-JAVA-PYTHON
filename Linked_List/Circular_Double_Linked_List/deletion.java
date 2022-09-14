package Circular_Double_Linked_List;

public class deletion {
    Node head;
    Node tail;
    int size = 0;

    Node create_cdl(int value) {
        if (head == null) {
            Node node = new Node();
            node.value = value;
            node.next = node;
            node.prev = node;
            head = node;
            tail = node;
            size = 1;
        } else {
            System.out.println("Linked List exists!");
        }
        return head;
    }

    Node insert(int loc, int value) {
        if (head != null) {
            Node node = new Node();
            node.value = value;
            if (loc == 0 || loc == size - 1) {
                node.next = head;
                node.prev = tail;
                head.prev = node;
                head = node;
                tail.next = head;
                size++;
            } else if (loc < 0 || loc > size) {
                System.out.println("Invalid location");
            } else {
                int t = 0;
                Node temp = head;
                while (t < loc) {
                    temp = temp.next;
                    t++;
                }
                node.next = temp.next;
                node.prev = temp;
                temp.next = node;
                node.next.prev = node;
                size++;
            }
        } else {
            create_cdl(value);
        }
        return head;
    }

    void traverse() {
        if(head!=null)
        {
            int t = 0;
            Node temp = head;
            while (t < size - 1) {
                System.out.print(temp.value + "->");
                temp = temp.next;
                t++;
            }
            System.out.println(temp.value);
        }
        else{
            System.out.println("Linked list doesn't exist!");
        }
    }

    void delete(int loc)
    {
        if(head!=null)
        {
            if(loc==0)
            {
                if(size==1)
                {
                    head.prev=null;
                    head.next=null;
                    head=null;
                    tail=null;
                    size--;
                }
                else{
                    head=head.next;
                    head.prev=tail;
                    tail.next=head;
                    size--;
                }
            }
            else if(loc==size-1)
            {
                if(size==1)
                {
                    head.prev=null;
                    head.next=null;
                    head=null;
                    tail=null;
                    size--;
                }
                else if(loc>size)
                {
                    System.out.println("Invalid location!");
                }
                else
                {
                    tail=tail.prev;
                    tail.next=head;
                    head.prev=tail;
                    size--;
                }
            }
            else
            {
                int t = 0;
                Node temp = head;
                while (t < loc-1) {
                    temp = temp.next;
                    t++;
                }
                temp.next=temp.next.next;
                temp.next.prev=temp;
                size--;
            }
        }
        else
        {
            System.out.println("Linked list doesn't exist!");
        }
    }

    void delete_entire_list(){
        Node temp=head;
        for(int i=0;i<size;i++)
        {
            temp.prev=null;
            temp=temp.next;
        }
        head=null;
        tail=null;
        System.out.println("Circular doubly linked list is successfully deleted!");
    }
    public static void main(String[] args) {
        deletion l1 = new deletion();
        l1.create_cdl(8);
        l1.insert(0, 2);
        l1.insert(0, 9);
        l1.insert(1, 7);
        l1.insert(4,3);
        l1.traverse();

        l1.delete(0);
        l1.delete(1);
        l1.traverse();
        l1.delete(3);
        l1.delete(9);
        l1.traverse();

        l1.delete_entire_list();
        l1.traverse();
    }
}
