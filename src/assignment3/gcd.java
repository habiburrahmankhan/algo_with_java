package assignment3;

import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        System.out.println("enter the first no  ");
        int a=s.nextInt() ;
        System.out.println("enter the second no ");
        int b = s.nextInt() ;
        System.out.println(gcd(a,b));
    }
    public static int gcd(int a,int b)
    {
        int gcd =1 ;
        for (int i = 1; i <=a && i <=b ; i++) {
            if(a%i==0 && b%i==0)
            {
                gcd=i ;
            }

        }
       return gcd ;
    }
}
