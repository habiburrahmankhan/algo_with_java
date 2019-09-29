package linkedlistassignment;

public class oddevenseparator {
    private node head , tail ;
    private  int size=0;
    private class node
    {
        private   int data ;
        private node next ;
        public node(int item)
        {
            this.data=item ;
        }
    }

    public void insertfirst(int item)
    {

        node node =new node(item);
        node.next=head;
        head=node ;
        size++ ;
        if (tail==null)
        {
            tail=head ;
        }


    }
//    public node get(int index)
//    {
//        node temp=head ;
//        for (int i = 0; i <index ; i++) {
//            temp=temp.next ;
//        }
//        return temp ;
//    }
    public void oddeven()
    {
         bubllesortt();
    }
    public void bubllesortt()
    {
        node nodei=head;

        while (nodei.next!=null)
        {
            node nodej = head ;
            while (nodej.next!=null)
            {
                if (nodej.data > nodej.next.data)
                {
                    int temp=nodej.data;
                    nodej.data=nodej.next.data;
                    nodej.next.data=temp ;
                }
                nodej=nodej.next;

            }
            nodei=nodei.next;
        }
    }
    public void display()
    {
        node node=head;
        while (node!=null)
        {
            System.out.println(node.data);
            node=node.next;
        }
    }

}


