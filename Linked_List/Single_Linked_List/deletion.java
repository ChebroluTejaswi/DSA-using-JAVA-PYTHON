package Single_Linked_List;

public class deletion {
    Node head;
    Node tail;
    int size = 0;

    Node create_sll(int value) {
        if (size == 0) {
            head = new Node();
            Node temp = new Node();
            temp.value = value;
            temp.next = null;
            head = temp;
            tail = temp;
            size = 1;
            System.out.println("Linked list created!");
            return head;
        } else {
            System.out.println("Linked List already exists!");
            return head;
        }
    }

    void insert(int value, int location) {
        if (head == null) {
            create_sll(value);
            return;
        }
        Node temp = new Node();
        temp.value = value;
        if (location == 0) {
            temp.next = head;
            head = temp;
            System.out.println("Inserted Node at beginning!");
        } else if (location >= size - 1) {
            temp.next = null;
            tail.next = temp;
            tail = temp;
            System.out.println("Inserted Node at the last!");
        } else {
            int index = 0;
            Node currentNode = head;
            while (index > location - 1) {
                currentNode = currentNode.next;
            }
            Node nextNode = currentNode.next;
            currentNode.next = temp;
            temp.next = nextNode;
            System.out.println("Inserted Node in between!");
        }
        size++;
    }

    void traverse_sll() {
        if (head == null) {
            System.out.println("Linked List is empty!");
            return;
        }
        Node temp = head;
        int t = size;
        while (t != 0) {
            if (t == 1) {
                System.out.print(temp.value);
                System.out.println();
                t--;
            } else {
                System.out.print(temp.value + "->");
                temp = temp.next;
                t--;
            }
        }
    }

    void search_sll(int value) {
        if (head == null) {
            System.out.println("Linked list is empty!");
            return;
        }
        Node temp = head;
        int t = size;
        int position = -1;
        while (t != 0) {
            if (temp.value == value) {
                position = size - t;
                System.out.println("Element found at position : " + position + " !");
                return;
            } else {
                temp = temp.next;
                t--;
            }
        }
    }

    // for deletion based on node value, we need to search for that node in list
    // then delete the node based on location
    void delete(int location) {
        if (head == null) {
            System.out.println("Linked list is empty!");
            return;
        } else if (location == 0) {
            if (size == 1) {
                head= null;
                tail = null;
                size--;
            } else {
                Node temp = head;
                head = temp.next;
                size--;
            }
            System.out.println("Deleted first node of linked list!");
        } else if (location == size - 1) {
            if (size == 1) {
                head = null;
                tail = null;
            } else {
                int t = 0;
                Node temp = head;
                while (t != size - 1) {
                    temp = temp.next;
                    t++;
                }
                temp.next = null;
                tail = temp;
                size--;
            }
            System.out.println("Deleted last node of Linked list!");
        } else {
            int t = 0;
            Node temp = head;
            while (t != location - 1) {
                temp = temp.next;
                t++;
            }
            temp.next = temp.next.next;
            size--;
            System.out.println("Deleted node from linked list");
        }
    }

    void delete_sll() {
        head = null;
        tail = null;
        System.out.println("Deleted entire linked list!");
    }

    public static void main(String args[]) {
        deletion ll1 = new deletion();
        ll1.create_sll(2);
        ll1.create_sll(4);
        ll1.insert(6, 0);
        ll1.insert(8, 0);
        ll1.insert(9, 7);
        ll1.insert(5, 1);
        ll1.insert(7, 3);
        ll1.insert(3, 1);
        ll1.traverse_sll();
        ll1.delete(0);
        ll1.traverse_sll();
        ll1.delete(2);
        ll1.traverse_sll();
        ll1.delete(4);
        ll1.traverse_sll();
        ll1.delete_sll();
        ll1.traverse_sll();
    }
}
