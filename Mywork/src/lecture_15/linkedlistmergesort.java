//package lecture_15;
//
//public class linkedlistmergesort {
//
//    private linkedlist1 head1 ,tail1  ;
//    private linkedlistsorted head ,tail ;
//    private int size=0 ;
//    private int size1=0;
//    private linkedlist2 head2 ,tail2 ;
//    private int size2=0;
//    private class linkedlist1
//    {
//        private int data ;
//        private linkedlist1 next ;
//        public linkedlist1(int item )
//        {
//            this.data=item;
//        }
//    }
//    private class linkedlistsorted
//    {
//        private int data ;
//        private linkedlist1 next ;
//        public linkedlistsorted(int item )
//        {
//            this.data=item;
//        }
//    }
//    private class linkedlist2
//    {
//        private int data ;
//        private linkedlist2 next ;
//        public linkedlist2(int item )
//        {
//            this.data=item;
//        }
//    }
//    public void insertatfirst1(int item )
//    {
//        linkedlist1 node = new linkedlist1(item);
//        node.next=head1 ;
//        head1=node ;
//        size1++ ;
//        if (tail1==null)
//        {
//            tail1=head1 ;
//        }
//    }
//    public void insertfirst2(int item )
//    {
//        linkedlist2 node = new linkedlist2(item);
//        node.next=head2 ;
//        head2=node ;
//        size2++ ;
//        if (tail2==null)
//        {
//            tail1=head1 ;
//        }
//    }
//
//    public void display1()
//    {
//        linkedlist1 node =head1;
//        while(node!=null)
//        {
//            System.out.println(node.data);
//            node=node.next ;
//        }
//        System.out.println("End");
//    }
//    public void display2()
//    {
//        linkedlist2 node =head2;
//        while(node!=null)
//        {
//            System.out.println(node.data);
//            node=node.next ;
//        }
//        System.out.println("End");
//    }
//    public void mergesort(linkedlist1 first ,linkedlist2 second)
//    {
//        node firstnode=first.head
//
//        while (node1.next!=null && node2.next!=null)
//        {
//            linkedlistsorted node ;
//            if (node1.data < node2.data)
//            {
//
//               node = new linkedlistsorted(node1.data);
//                node1=node1.next ;
//            }
//            else
//            {
//                 node = new linkedlistsorted(node2.data);
//                node2=node2.next ;
//            }
//
//            if (head==null)
//            {
//                head=node ;
//                temp=head ;
//            }
//            if (tail==null)
//            {
//                tail=head ;
//            }
//
//
//            temp=node;
//        }
//
//        while (node1.next!=null)
//        {
//            linkedlistsorted node = new linkedlistsorted(node1.data);
//            node1=node1.next;
//            temp=node;
//        }
//        while (node2.next!=null)
//        {
//            linkedlistsorted node = new linkedlistsorted(node1.data);
//            node2=node2.next;
//            temp=node;
//        }
//
//
//    }
//
//}
