package lecture_12;

import java.util.Arrays;

public class queue_imp {
   private int nqueue[];
    private int end ;
      private int default_size ;

    public queue_imp()
    {
        this.default_size=10 ;
        this.nqueue=new int[default_size] ;
        int end=0;
    }
    public  boolean enqueue(int item)
    {
        if(isFull())
        {
            return false ;
        }
        nqueue[end++]=item ;
        return true ;
    }
    public int dequeue() throws Exception
    {
        if (isEmpty())
        {
           throw new Exception("abe khali hai be ") ;
        }
      int pop_element=nqueue[0] ;
        for (int i = 1; i <end ; i++) {
            nqueue[i-1]=nqueue[i];
        }
        end-- ;
        return pop_element ;
    }
    public int peek()
    {
        return nqueue[end] ;
    }
    public boolean isFull()
    {
        return end==nqueue.length -1 ;
    }
    public boolean isEmpty()
    {
        return end==0 ;
    }
    public void display()
    {
        for (int i = 0; i <end ; i++) {
            System.out.print(nqueue[i] + "  ");
        }
    }

    public static void main(String[] args) {
        queue_imp q = new queue_imp();
        q.enqueue(100);
        q.enqueue(120);
        q.enqueue(130);
        q.enqueue(140);
        try {
            System.out.println(q.dequeue());
        }
        catch (Exception e )
        {
            System.out.println(e.getMessage());
        }
        System.out.println(q.peek());
        q.display();

    }
}
