package assignment3;

import java.util.Scanner;

public class armstrongnobetween {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        System.out.println("enter the first no  ");
        int first=s.nextInt() ;
        System.out.println("enter the last no ");
        int last = s.nextInt() ;
        while(first<=last)
        {
            if(armstrong(first))
            {
                System.out.println(first);
            }
            first++ ;
        }
    }


    public static boolean armstrong(int n)
    {
        int armstrong=0;
        int m=n;
        while(n>0)
        {
            armstrong+=Math.pow(n%10 ,3);
            n/=10 ;
        }

        if(armstrong==m)
        {
            return true ;
        }
        return false ;
    }

}
