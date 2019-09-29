package hackerblock;

import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n1=s.nextLong();
        long n2=s.nextLong();
        System.out.println(lcmno(n1,n2));
    }
    public static long lcmno(long n1 , long n2)
    {
          long c=gcd(n1 , n2) ;
        long lcm = (n1*n2)/c;
         return lcm ;

    }

    public static long gcd(long a , long b)

    {
        if(b%a==0)
        {
            return a ;
        }
        return gcd(b%a , a) ;
    }
}
