package lecture3;

import java.util.Scanner;

public class anytoany {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        int n=s.nextInt() ;
        int fbase=s.nextInt() ;
        int sbase=s.nextInt() ;
        System.out.println(anytoany(n,fbase,sbase));
     }

    public static int anytoany(int any , int fbase , int sbase)
    {
        int deci=anytodeci(any ,fbase) ;
        return decitoany(deci ,sbase) ;
    }

    public static int anytodeci(int any ,int base)
    {
        int place=1 ,deci=0 ;
        while(any>0)
        {
            deci=deci + (any%10)*place ;
            place*=base ;
            any/=10 ;
        }

        return deci ;
    }


    public static int decitoany(int any ,int base)
    {
        int place=1 ,deci=0 ;
        while(any>0)
        {
            deci=deci*10 + (any%base) ;

            any/=base ;
        }

        return deci ;
    }
}
