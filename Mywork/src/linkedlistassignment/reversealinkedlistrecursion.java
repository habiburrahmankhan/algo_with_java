package linkedlistassignment;


public class  reversealinkedlistrecursion{
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
    public void insertlast(int item)
    {
        if (head==null)
        {
            insertfirst(item);
            size++;
            return;
        }
        node node =new node(item);
        tail.next=node;
        tail=node;
        size++;
    }
    public node get(int index)
    {
        node temp=head ;
        for (int i = 0; i <index ; i++) {
            temp=temp.next ;
        }
        return temp ;
    }
    public void reverse()
    {
        reverse(head);
    }
    public void reverse(node temp)
    {
       if (temp==tail)
       {
           head=tail ;
           return;
       }
       reverse(temp.next);
       tail.next=temp;
       tail=temp;
       tail.next=null;
    }
    public boolean palidrome()
    {
        return palidrome(head , size);
    }
    private boolean palidrome(node temp ,int size)
    {
        if (temp==tail)
        {
            return true ;
        }
        int data =get(size-1).data ;
      //  System.out.println(data);
        if (temp.data!=data)
        {
            return false ;
        }
        return palidrome(temp.next , size-1);


    }
    public void reversewithoutrecursion()
    {
           node p ,q ,r ;
           p=null;
           q=head;
           r=q.next;
           while (r!=null)
           {
               q.next=p;
               p=q;
               q=r;
               r=r.next;
           }
           q.next=p;
           head=q ;
           q=head;
           while (q.next!=null)
           {
               q=q.next;

           }
           tail=q;
        System.out.println("the last element is  "+ tail.data);
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
