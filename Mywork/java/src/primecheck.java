import java.util.Scanner;

public class primecheck {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        int n = s.nextInt() ;
        int i=2 ;
        while (i*i< n)
        {
            if(n%i==0)
            {
                System.out.println(n + "  is not a prime no ");
                System.exit(0);
            }
            else
            {
                i++ ;
            }
        }
        System.out.println( n + " is  prime no ");
    }

}
