package Single_LinkedList;

public class insertion {
    static class Node{
        int value;
        Node next;
    }
    static class singlylinkedlist{
        Node head;
        Node tail;
        int size;
        Node createsinglylinkedlist(int val){
            head=new Node();
            Node node=new Node();
            node.value=val;
            node.next=null;
            head=node;
            tail=node;
            size=1;
            return head;
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
    }
    public static void main(String args[]){
        singlylinkedlist l1=new singlylinkedlist();
        l1.createsinglylinkedlist(5);
        System.out.println(l1.head.value);
        l1.insertion(8,0);
        System.out.println(l1.head.value);
    }    
}