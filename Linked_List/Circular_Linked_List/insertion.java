package Circular_Linked_List;

public class insertion {
    Node head;
    Node tail;
    int size = 0;

    Node create_sll(int value) {
        if (size == 0) {
            Node node = new Node();
            node.value = value;
            node.next = node;
            head = node;
            tail = node;
            size = 1;
        } else {
            System.out.println("Linked list exists!");
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
            } else if (loc >= size) {
                System.out.println("Entered location is invalid");
            } else if (loc == size) {
                tail.next = node;
                tail = node;
                tail.next = head;
            } else {
                int t = 0;
                Node temp = head;
                while (t != loc) {
                    temp = temp.next;
                    t++;
                }
                node.next = temp.next;
                temp.next = node;
            }
            size++;
        } else {
            create_sll(value);
        }
        return head;
    }

    public static void main(String[] args) {
        insertion l1 = new insertion();
        l1.create_sll(8);
        l1.insert(0, 2);
        l1.insert(0, 3);
        l1.insert(1, 9);
        l1.insert(3, 7);
        System.out.println(l1.head.value);
        System.out.println(l1.head.next.value);
        System.out.println(l1.head.next.next.value);
        System.out.println(l1.head.next.next.next.value);
    }
}
