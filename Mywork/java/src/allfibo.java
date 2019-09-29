import java.util.Scanner;

public class allfibo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;

        int n=s.nextInt() ;
        int a=0;
        int b=1;
        int c;
        int i=0;

        do
        {
            System.out.println("the "+ i +"th fibonacci series is    " + a);
            c=a+b ;
            a=b;
            b=c;
            n--;
            i++ ;
        } while (n> 0) ;



    }
}
