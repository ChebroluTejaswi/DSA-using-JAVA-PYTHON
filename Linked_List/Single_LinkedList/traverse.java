package Single_LinkedList;

public class traverse {
    static class Node{
        int value;
        Node next;
    }
    static class singlylinkedlist{
        Node head;
        Node tail;
        int size;
        Node createsinglylinkedlist(int val){
            if(size==0){
                Node node=new Node();
                node.value=val;
                node.next=null;
                head=node;
                tail=node;
                size=1;
                return head;
            }
            else
            {
                System.out.println("Linked list exists");
               return head;
            }
        }
        void insertion(int val,int loc){
            //create a node
            Node node=new Node();
            node.value=val;
            //if linked list doesn't exist
            if(head==null){
                createsinglylinkedlist(val);
                return;
            }
            //if we are inserting new node at beginning
            else if(loc==0){
                node.next=head;
                head=node;
            }
            //if we are inserting new node at ending
            else if(loc>=size){
                node.next=null;
                tail.next=node;
                tail=node;
            }
            else{
                Node temp= head;
                int index=0;
                while(index<loc-1){
                    temp=temp.next;
                    index++;
                }
                Node nextnode=temp.next;
                temp.next=node;
                node.next=nextnode;
            }
            size++;
        }
        void traverse_list(){
            System.out.println("Traversing the linked list...................");
            if(head==null)
            {
                System.out.println("Your linked list is empty");
                return;
            }
            Node node=head;
            int t=size;
            while(t!=0)
            {
                System.out.println(node.value);
                node=node.next;
                t--;
            }
        }
    }
    public static void main(String args[]){
        singlylinkedlist l1=new singlylinkedlist();
        l1.createsinglylinkedlist(5);
        System.out.println(l1.head.value);
        l1.insertion(8,0);
        l1.insertion(9,0);
        l1.insertion(6,2);
        l1.insertion(16,2);
        l1.insertion(2,3);
        System.out.println(l1.head.value);
        l1.traverse_list();
    }
}
