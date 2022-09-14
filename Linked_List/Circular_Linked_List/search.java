package Circular_Linked_List;

public class search {
    Node head;
    Node tail;
    int size = 0;

    Node create_cll(int value) {
        if (size == 0) {
            Node node = new Node();
            node.value = value;
            node.next = node;
            head = node;
            tail = node;
            size = 1;
            System.out.println("Linked list created!");
        } else {
            System.out.println("Linked List already exists!");
        }
        return head;
    }

    Node insert(int loc, int value) {
        if (head != null) {
            Node node = new Node();
            node.value = value;
            if (loc == 0) {
                node.next = head;
                head = node;
                tail.next = head;
            } else if (loc > size) {
                System.out.println("Enter valid location!");
            } else if (loc == size - 1) {
                tail.next = node;
                tail = node;
                tail.next = head;
            } else {
                int t = loc;
                Node temp = head;
                while (t > 0) {
                    temp = temp.next;
                    t--;
                }
                node.next = temp.next;
                temp.next = node;
            }
            size++;
        } else {
            create_cll(value);
        }
        return head;
    }

    void traverse() {
        Node temp = head;
        int t = size - 1;
        while (t > 0) {
            System.out.print(temp.value + "->");
            temp = temp.next;
            t--;
        }
        System.out.println(temp.value);
    }

    void searchinlist(int searchval) {
        if(head!=null)
        {
            Node node = head;
            int t = 0;
            while (t < size) {
                if (node.value == searchval) {
                    System.out.println("Element found! position: " + t);
                    return;
                }
                node = node.next;
                t++;
            }
            System.out.println("Element not found!");
            return;
        }
        else
        {
            System.out.println("Linked list doesn't exist!");
        }
    }

    public static void main(String[] args) {
        search cll = new search();
        cll.create_cll(3);
        cll.insert(0, 4);
        cll.insert(0, 9);
        cll.insert(1, 8);
        cll.insert(8, 2);
        cll.insert(2, 5);
        cll.traverse();

        cll.searchinlist(8);
        cll.searchinlist(1);
    }
}
