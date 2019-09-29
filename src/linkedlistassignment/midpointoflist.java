package linkedlistassignment;

public class midpointoflist {
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
    public node get(int index)
    {
        node temp=head ;
        for (int i = 0; i <index ; i++) {
            temp=temp.next ;
        }
        return temp ;
    }
   public int midpoint()
   {
       node fast =head;
       node slow = head;
       while (slow.next!=null && fast.next.next!=null)
       {
           slow = slow.next;
           fast=fast.next.next;
       }
       return slow.data;
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


