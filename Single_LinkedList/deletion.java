package Single_LinkedList;

public class deletion {
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
            else if(loc==size){
                node.next=null;
                tail.next=node;
                tail=node;
            }
            else if(loc>size){
                System.out.println("Entered location is not valid");
                return;
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
        void search_list(int x){
            int position;
            if(head==null)
            {
                System.out.println("Your linked list is empty");
                return ;
            }
            Node node=head;
            int t=size;
            while(t!=0)
            {
                if(x==node.value){
                    position=size-t;
                    System.out.println("Element found! position: "+(position+1));
                    return;
                }
                else
                {
                    node=node.next;
                    t--;
                }
            }
            System.out.println("Element not found!");
        }
        void delete_node(int location){
            if(head!=null){
                if(location>size){
                    System.out.println("Entered location is not valid");
                }
                //deleting first node
                else if(location==0)
                {
                    Node node=head;
                    if(size==1) // there exists only 1 node in linked list
                    {
                        head=null;
                        tail=null;
                        size--;
                    }
                    else // there exists more than 1 node in linked list
                    {
                        head=node.next;size--;
                    }
                }
                //deleting last node
                else if(location==size){
                    Node node=head;
                    if(size==1) // there exists only 1 node in linked list
                    {
                        head=null;
                        tail=null;
                    }
                    else // there exists more than 1 node in linked list
                    {
                        int t=0;
                        while(t!=size-1)
                        {
                            node=node.next;
                            t++;
                        }
                        node.next=null;
                        tail=node;
                        size--;
                    }
                }
                //deleting node in between(at some given location)
                else{
                    int t=1;
                    Node node=head;
                    while(t!=location){
                        node=node.next;
                        t++;
                    }
                    node.next=node.next.next;
                    size--;
                }
            }
            else
            {
                System.out.println("Your linked list is empty");
            }
        }
        void delete_entire_list()
        {
            head=null;
            tail=null;
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
        l1.search_list(2);
        l1.delete_node(3);
        l1.traverse_list();
        singlylinkedlist l2=new singlylinkedlist();
        l2.createsinglylinkedlist(4);
        l2.insertion(6,0);
        l2.traverse_list();
        l2.delete_entire_list();
        l2.traverse_list();
    } 
}