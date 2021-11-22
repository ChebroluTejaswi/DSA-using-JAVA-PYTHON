package Linked_List_questions;

import java.util.HashSet;
public class remove_duplicates {
    void remove_dupli(LinkedList ll){
        HashSet<Integer> hs = new HashSet();
        Node current=ll.head;
        Node prev= null;
        while(current!=null)
        {
            int value=current.value;
            if(hs.contains(value)) //delete this node
            {
                prev.next=current.next;
                ll.size--;
            }
            else // add this value to hashset
            {
                hs.add(value);
                prev=current;
            }
            current=current.next;
        }
    }
}
