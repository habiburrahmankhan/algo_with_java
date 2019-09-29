package lecture_14;




public class circular_queue {
    protected int nqueue[];
    protected int end ;
    protected int default_size ;
    protected int front ;
    protected int size ;
    public circular_queue()
    {
        this.default_size=5 ;
        this.nqueue=new int[default_size] ;
        this.end=0;
        this.front =0;
        this.size=0;
    }
    public  boolean enqueue(int item)
    {
        if(isFull())
        {
            return false ;
        }
        nqueue[end++]=item ;
        end=end%nqueue.length ;
        size++ ;
        return true ;
    }
    public int dequeue()
    {

        int pop_element=nqueue[front++] ;

        front=front%nqueue.length ;
        size-- ;
        return pop_element ;
    }
    public boolean isFull()
    {
        return size==nqueue.length ;
    }

    public void display()
    {
        for (int i = 0; i <size ; i++) {
            System.out.print(nqueue[(front+i)%nqueue.length] + "  ");
        }
    }

    public static void main(String[] args) {
        circular_queue q = new circular_queue();
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
       // System.out.println(q.peek());
        q.enqueue(160);
        q.enqueue(170);
        q.enqueue(180);
        q.display();
        System.out.println();
     //   sum(1,2,3,4,5,6,7,8,9);
    }

    public static void sum(int... ar)
    {
        int s=0;
        for (int i = 0; i < ar.length; i++) {
            s+=ar[i];
        }
        System.out.println("sum= "+s);
    }
}
