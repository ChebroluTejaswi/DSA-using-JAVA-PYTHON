package Single_Linked_List;

public class creation {
    // create head and tail initialize with null
    Node head;
    Node tail;
    int size = 0;

    // create temp node and assign a value
    // link head and tail to temp node
    Node create_sll(int value) {
        if (size == 0) {
            Node node = new Node();
            node.value = value;
            node.next = null;
            head = node;
            tail = node;
            size = 1;
            System.out.println("Created Linked List!");
            return head;
        } else {
            System.out.println("Linked list exists!");
            return head;
        }
    }

    public static void main(String args[]) {
        creation L1= new creation();
        L1.create_sll(3);
        L1.create_sll(8);
        System.out.println(L1.head.value);
    }
}
