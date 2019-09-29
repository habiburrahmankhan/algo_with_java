package hackerblock;

public class linkedlistclient {
    public static void main(String[] args) throws Exception {
        linkedlist ll = new linkedlist();

        ll.addfirst(5);
        ll.addlast(40);
        ll.addlast(50);
        ll.addlast(60);
        ll.addlast(70);
        ll.addlast(80);
        ll.addfirst(10);
        ll.addfirst(20);
        ll.addfirst(30);
        System.out.println( "the first element in linked list "+ ll.getfirst());
        System.out.println( "the first element in linked list "+ ll.getLast());
        System.out.println( "the  element in linked list "+ ll.getat(2));
        ll.addat(2,55);
        ll.display();
        System.out.println("the first element is remove " + ll.removefirst());
        System.out.println("the last element is remove " + ll.removeLast());
        System.out.println("the  element is remove at  " + ll.removeAt(2));
        ll.display();
     //   ll.reverseData();
        ll.display();
    }
}
