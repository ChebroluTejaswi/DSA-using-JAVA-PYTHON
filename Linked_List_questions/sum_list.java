package Linked_List_questions;

public class sum_list {
    LinkedList sum(LinkedList l1, LinkedList l2){
        LinkedList l3=new LinkedList();
        Node temp1=l1.head;
        Node temp2=l2.head;
        for(int i=0;i<(l1.size);i++)
        {
            int value=temp1.value+temp2.value;
            if(value>9){
                int f,s;
                s=value%10;
                f=(value/10)%10;
                if(i==0)
                {
                    l3.createLL(s);
                }
                else{
                    l3.insertnode(s);
                }
                temp1=temp1.next;
                temp2=temp2.next;
                temp2.value=temp2.value+f;
            }
            else{
                if(i==0)
                {
                    l3.createLL(value);
                }
                else{
                    l3.insertnode(value);
                }
                temp1=temp1.next;
                temp2=temp2.next;
            }
        }
        return l3;
    }
}
