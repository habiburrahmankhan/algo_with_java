package assignment3;

import java.util.Scanner;

public class interalpartofno {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter the no");
        int a=s.nextInt() ;
        System.out.println("the interal sqrt is " + integralsquareroot(a));


    }
    public static int integralsquareroot(int a)
    {
        int i=0 ,s =0 ;
        while (i*i<=a)
        {
           s=i ;

            i++ ;
        }
        return s ;
    }


}
