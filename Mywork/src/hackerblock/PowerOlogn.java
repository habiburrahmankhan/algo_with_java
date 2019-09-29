package hackerblock;

import java.util.Scanner;

public class PowerOlogn {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a= s.nextInt();
        int n= s.nextInt();
        System.out.println(power(a,n));
    }
    public static int power(int a , int n)
    {
        if (n==1)
        {
            return a;

        }
         if(n%2==0)
        {
            int  d = power(a,n/2 );
            return (d*d);
        }
        else
        {
            return a*power(a,n-1 );
        }
    }
}
