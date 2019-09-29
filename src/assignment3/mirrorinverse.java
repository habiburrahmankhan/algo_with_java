package assignment3;

import java.util.Scanner;

public class mirrorinverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        System.out.println("enter the no  ");
        int n=s.nextInt() ;
        System.out.println(mirrorinverse(n));
    }
    public static int inverse( int n )
    {
        int inverse=0 ,place=1 ;
        while(n>0)
        {
            int  rem=n%10 ;
            inverse=inverse+ (int)(place*Math.pow(10 ,rem -1)) ;
            n/=10;
            place++ ;
        }
        return inverse ;
    }
    public static boolean mirrorinverse(int n)
    {
        int mirror=inverse(n) ;
        if(mirror==n)
        {
            return true ;
        }
        return false ;
    }
}
