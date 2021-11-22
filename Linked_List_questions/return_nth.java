package Linked_List_questions;

public class return_nth {
    // int nth_tolast(LinkedList ll,int n){
    //     int size=ll.size;
    //     Node node=ll.head;
    //     for(int i=0;i<size;i++)
    //     {
    //         if(i==(size-n))
    //         {
    //             return node.value;
    //         }
    //         node=node.next;
    //     }
    //     return 0;
    // }

    int nth_tolast(LinkedList ll,int n){
        Node p1=ll.head;
        Node p2=ll.head;
        for(int i=0;i<n;i++)
        {
            if(p2 == null)
                return 0;
            p2=p2.next;
        }
        while(p2!=null){
            p1=p1.next;
            p2=p2.next;
        }
        return p1.value;
    }


}
