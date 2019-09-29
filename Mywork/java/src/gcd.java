import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        int a=s.nextInt() ,b=s.nextInt() ;
        int i=1 ,g=1 ;
        while(i<=a && i<=b)
        {
            if (a%i==0 && b%i==0)
            {
                g=i ;
            }
            i++ ;
        }
        System.out.println(" The gcd of  " + a + "  " + b + "  is   " + g);

    }
}

