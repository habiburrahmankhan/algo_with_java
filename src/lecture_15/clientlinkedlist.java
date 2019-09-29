package lecture_15;

import java.util.LinkedList;

public class clientlinkedlist {
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
//        ll.insertfirst(100) ;
//        ll.insertfirst(150) ;
//        ll.insertfirst(200) ;
//        ll.insertfirst(250) ;
//        ll.insertfirst(300) ;
//        ll.insertatlast(6000);
//        ll.insertatlast(400);
//        ll.display();
//        System.out.println( "deleted element is " + ll.deleteatfirst()) ;
//        System.out.println( "deleted element is " + ll.deleteatlast()) ;
//        System.out.println( "deleted element is " + ll.deleteatanyposition(2)) ;
//        ll.get(2);
       // ll.insertatposition(2,333);

     //   System.out.println("linked list are : --- ");
     //   ll.display();
     //   System.out.println(" mid element is  "+ll.midoflinkedlist());

      //  ll.callreverse();
    //    System.out.println("linked list are : --- ");
     //   ll.display();



        linkedlist2 ll1 = new linkedlist2();

        linkedlist2 ll2 = new linkedlist2();
        linkedlist2 list = new linkedlist2();
        ll1.insertatlast(100);
        ll1.insertatlast(145);
        ll1.insertatlast(299);
        ll1.insertatlast(5677);
        ll2.insertatlast(32);
        ll2.insertatlast(64);
        ll2.insertatlast(464);
        ll2.insertatlast(3222);
        System.out.println("the list 1 is :-");
        ll1.display();
        System.out.println("the list 1 is :-");
        ll2.display();
        System.out.println("the merge list   is :-");
        linkedlist2 list3=list.merge(ll1,ll2);
        list3.display();






    }
}
