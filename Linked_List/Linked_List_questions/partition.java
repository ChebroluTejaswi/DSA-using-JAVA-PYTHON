package Linked_List_questions;

public class partition {
    // LinkedList partition_ll(LinkedList ll,int x){
    //     LinkedList l3=new LinkedList();
    //     l3.createLL(ll.head.value);
    //     Node node=ll.head.next;
    //     for(int i=0;i<ll.size-1;i++)
    //     {
    //         if(node.value<10) // add this node at begining
    //         {
    //             Node temp=new Node();
    //             temp.value=node.value;
    //             temp.next=l3.head;
    //             l3.head=temp;
    //         }
    //         else //add node at last
    //         {
    //             l3.insertnode(node.value);
    //         }
    //         node=node.next;
    //         l3.size++;
    //     }
    //     return l3;
    // }
    LinkedList partition_ll(LinkedList ll,int x){
        Node currentnode=ll.head;
        ll.tail=ll.head;
        while(currentnode!=null){
            Node next=currentnode.next;
            if(currentnode.value<x){
                currentnode.next=ll.head;
                ll.head=currentnode;
            }
            else{
                ll.tail.next=currentnode;
                ll.tail=currentnode;
            }
            currentnode=next;
        }
        ll.tail.next=null;
        return ll;
    }
}
