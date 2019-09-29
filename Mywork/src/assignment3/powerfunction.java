package assignment3;

import java.util.Scanner;

public class powerfunction {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        System.out.println("enter the x(base) no  ");
        int a=s.nextInt() ;
        System.out.println("enter the n(power) no ");
        int b = s.nextInt() ;
        System.out.println(power(a,b));
    }
    public static int power(int x,int n)
    {
        int pow=1 ,i=1 ;
        while(i<=n)
        {
            pow*=x;
            i++;
        }
        return pow  ;
    }
}
