package lecture_12;

public class stack {

        private int arr[] ;
        private int default_size;
        int  top ;
        public stack()
        {
            this.default_size=10;
            this.arr=new int[default_size] ;
            this.top=-1 ;
        }
    public boolean push(int item )
    {
        if(isFull())
        {
            return false ;
        }
        arr[++top]=item ;
        return true ;
    }
    public int pop() throws Exception
    {
        if (isEmpty())
        {
           throw new Exception("abe khali hai be ");
        }
        return arr[top--] ;
    }
    public int peek()
    {
        return arr[top] ;
    }

    public boolean isFull()
    {
        return top==arr.length-1 ;
    }
    public boolean isEmpty()
    {
        return top==-1;
    }

    public static void main(String[] args) {
        stack s= new stack();
        s.push(100) ;
        s.push(120);
        s.push(232);
        s.push(234);
        try {
            s.pop();
            s.pop();
            s.pop();
            s.pop();
            s.pop();

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }


        System.out.println("hello");
    }
}
