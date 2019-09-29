package assignment3;

import java.util.Scanner;

public class binarytodecimai {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        System.out.println("enter the no  ");
        int n=s.nextInt() ;
        System.out.println("enter the base ");
        int base =s.nextInt() ;
        System.out.println("enter the base to convert");
        int sbase = s.nextInt() ;

        System.out.println(anytoany(n ,base , sbase)) ;

    }
    public static int anytodeci(int n,int base)
    {
        int deci=0 ,place=1;
        while(n>0)
        {
            deci=deci + place*n%10 ;
            n/=10 ;
            place*=base ;
        }
        return deci ;
    }

    public static int decitoany(int n,int base)
    {
        int any=0 ;
        while(n>0)
        {
            any=any*10 + n%base ;
            n/=base ;
        }
        return any ;
    }
    public static int anytoany(int n,int fbase ,int sbase)
    {
        int deci=anytodeci( n ,fbase) ;
        return decitoany(deci , sbase) ;
    }


}
