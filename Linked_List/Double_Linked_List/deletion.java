package Double_Linked_List;

public class deletion {
    Node head;
    Node tail;
    int size = 0;

    Node create_dll(int value) {
        if (head == null) {
            Node node = new Node();
            node.prev = null;
            node.next = null;
            node.value = value;
            head = node;
            tail = node;
            size = 1;
        } else {
            System.out.print("Linked list exists!");
        }
        return head;
    }

    Node insert(int loc, int value) {
        if (head != null) {
            Node node = new Node();
            node.value = value;
            if (loc == 0) {
                node.next = head;
                node.prev = null;
                head.prev = node;
                head = node;
                size++;
            } else if (loc < 0 || loc > size) {
                System.out.println("Invalid location!");
            } else if (loc == size - 1) {
                node.next = null;
                node.prev = tail;
                tail.next = node;
                tail = node;
                size++;
            } else {
                int t = 0;
                Node temp = head;
                while (t < loc - 2) {
                    temp = temp.next;
                    t++;
                }
                node.prev = temp;
                node.next = temp.next;
                temp.next = node;
                node.next.prev = node;
                size++;
            }
        } else {
            create_dll(value);
        }
        return head;
    }

    void traverse() {

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

    void delete(int loc) {
        if (head != null) {
            if (loc == 0) {
                if (size == 1) {
                    head = null;
                    tail = null;
                } else {
                    head = head.next;
                    head.prev = null;
                }
                size--;
            } else if (loc == size - 1) {
                if (size == 1) {
                    head = null;
                    tail = null;
                } else {
                    tail = tail.prev;
                    tail.next = null;
                }
                size--;
            } else if (loc < 0 || loc > size) {
                System.out.println("Invalid location!");
            } else {
                int t = 0;
                Node temp = head;
                while (t < loc-1) {
                    t++;
                    temp = temp.next;
                }
                temp.next = temp.next.next;
                temp.next.prev = temp;
                size--;
            }
        } else {
            System.out.println("Linked list doesn't exist!");
            return;
        }
    }

    void delete_sll() {
        head = null;
        tail = null;
        System.out.println("Deleted entire linked list!");
    }

    public static void main(String[] args) {
        deletion l1 = new deletion();
        l1.create_dll(3);

        l1.insert(0, 8);
        l1.insert(0, 9);
        l1.insert(1, 4);
        l1.insert(4, 7);
        l1.insert(9, 5);

        l1.traverse();

        l1.delete(0);
        l1.delete(1);
        l1.delete(7);

        l1.traverse();

        l1.delete_sll();
        l1.traverse();
    }
}
