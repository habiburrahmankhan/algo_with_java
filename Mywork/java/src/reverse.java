import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        int n =s.nextInt() ;
        int m=n ;
        int rev =0;
        while (n>0)
        {
            rev= rev *10 + n%10 ;
            n/=10 ;
        }
        System.out.println("the reverse of " + m + " is " + rev );

    }
}
