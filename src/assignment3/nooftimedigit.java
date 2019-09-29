package assignment3;

import java.util.Scanner;

public class nooftimedigit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        System.out.println("enter the no  ");
        int n=s.nextInt() ;
        System.out.println("enter the digit ");
        int digit =s.nextInt() ;
        System.out.println( nooftime(n,digit) + " times the digit " + digit +  "  is ");
    }

    public static  int nooftime(int n ,int digit)
    {
        int count =0;
        while(n>0)
        {
            int rem=n%10 ;
            if (digit==rem)
            {
                count++;
            }
            n/=10;
        }
        return count ;
    }
}
