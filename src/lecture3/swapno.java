package lecture3;

public class swapno {
    public static void main(String[] args) {
        int a=6,b=7 ;
        swap(a,b) ;

    }
    public static void  swap(int a ,int b)
    {
        int temp ;
        temp=a;
        a=b;
        b=temp;
        System.out.println(a + "    " + b);
    }
}
