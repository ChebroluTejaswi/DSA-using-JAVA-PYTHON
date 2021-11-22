package Linked_List_questions;

public class intersection {
    void addsamenode(LinkedList lla,LinkedList llb,int value){
        Node temp=new Node();
        temp.value=value;
        temp.next=null;
        lla.tail.next=temp;
        lla.tail=temp;
        llb.tail.next=temp;
        llb.tail=temp;
        lla.size++;
        llb.size++;
    }
    Node samenodecount(LinkedList lla,LinkedList llb){
        if(lla.head==null || llb.head==null ) return null;
        if(lla.tail!=llb.tail) return null;
        int a=lla.size;int b=llb.size;int d=0;int count=0;
        Node temp1=lla.head;
        Node temp2=llb.head;
        if(a>b)
        {
            d=b;
            for(int i=0;i<(a-b);i++)
            {
                temp1=temp1.next;
            }
        }
        else if(b>a)
        {
            d=a;
            for(int i=0;i<(b-a);i++)
            {

                temp2=temp2.next;
            }
        }
        for(int i=0;i<(d-1);i++){
            if(temp1.next==temp2.next){
                count++;
            }
            temp1=temp1.next;temp2=temp2.next;
        }
        System.out.println(count);
        Node node=lla.head;
        for(int i=0;i<lla.size-count;i++)
        {
            node=node.next;
        }
        return node;
    }
}
