package lecture_18;


public class arraylist<M> {
    private  M arr[] ;
    private int default_size ;
    private int size ;

    public  arraylist()
    {
        this.default_size=10 ;
        this.size=0;
       // this.arr=new M[default_size] ;
    }
//    public int get(M index) throws Exception
//    {
//        if (size-1<index) {
//            throw new Exception("index galat hai ");
//        }
//        return arr[index] ;
//    }
    public void remove()
    {
        size-- ;
    }
    public void add(M item)
    {
//        if (isFull())
//        {
//            resize() ;
//        }
        arr[size++]=item ;
    }
    public boolean isFull()
    {
        return size==arr.length;
    }
//    public void resize()
//    {
//        int temp[] = new int[arr.length*2] ;
//        for (int i = 0; i <arr.length ; i++) {
//            temp[i]=arr[i] ;
//        }
//        arr=temp ;
//    }
    public void set(int index ,M element) throws Exception
    {
        if (size-1<index) {
            throw new Exception("index galat hai ");
        }
        arr[index]=element ;
    }
    public void display()
    {
        for (int i = 0; i <size ; i++) {
            System.out.print(arr[i]+ "  " );
        }
    }
}

