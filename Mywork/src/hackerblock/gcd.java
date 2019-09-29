package hackerblock;

import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in) ;
        int n1=s.nextInt() ;
        int n2 = s.nextInt();
        System.out.println(gcd(n1,n2));
    }
    public static int gcd(int a , int b)

    {
        if(b%a==0)
        {
            return a ;
        }
        return gcd(b%a , a) ;
    }
}
