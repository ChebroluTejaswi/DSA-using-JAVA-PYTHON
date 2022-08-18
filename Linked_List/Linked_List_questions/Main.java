package Linked_List_questions;

public class Main {
    public static void main(String[] args) {
        // LinkedList ll=new LinkedList();
        // ll.createLL(1);
        // ll.insertnode(2);
        // ll.insertnode(1);
        // ll.insertnode(3);
        // ll.traverse();
        //----------Question: remove duplicates----------------
            // remove_duplicates r= new remove_duplicates();
            // r.remove_dupli(ll);
            // ll.traverse();

        //----------Question: return nth to last----------------
            // return_nth r =new return_nth();
            // System.out.println(r.nth_tolast(ll,3));

        //----------Question: partition-------------------------
            // partition r=new partition();
            // LinkedList l1=new LinkedList();
            // l1.createLL(11);
            // l1.insertnode(3);
            // l1.insertnode(9);
            // l1.insertnode(10);
            // l1.insertnode(15);
            // LinkedList l2=r.partition_ll(l1, 10);
            // l2.traverse();
        //----------Question: sum lists -------------------------
            // sum_list r=new sum_list();
            // LinkedList l1=new LinkedList();
            // l1.createLL(7);
            // l1.insertnode(1);
            // l1.insertnode(6);
            // l1.traverse();

            // LinkedList l2=new LinkedList();
            // l2.createLL(5);
            // l2.insertnode(9);
            // l2.insertnode(2);
            // l2.traverse();

            // LinkedList l3=r.sum(l1, l2);
            // l3.traverse();
        //----------Question: intersection-------------------------
        LinkedList lla=new LinkedList();
        lla.createLL(3);
        lla.insertnode(1);
        lla.insertnode(5);
        lla.insertnode(9);
        LinkedList llb=new LinkedList();
        llb.createLL(2);
        llb.insertnode(4);
        llb.insertnode(6);
        intersection r=new intersection();
        r.addsamenode(lla,llb,7);
        r.addsamenode(lla,llb,2);
        r.addsamenode(lla,llb,2);
        lla.traverse();
        llb.traverse();
        Node node=r.samenodecount(lla, llb);
        System.out.println(node.value);
    }
}
