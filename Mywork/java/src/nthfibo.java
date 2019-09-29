import java.util.Scanner;

public class nthfibo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;

        int n=s.nextInt() ;
        int a=0;
        int b=1;
        int c;

        while (n> 0)
        {
            c=a+b ;
            a=b;
            b=c;
            n--;
        }
        System.out.println("the nth fibonacci series is    " + a);


    }
}
