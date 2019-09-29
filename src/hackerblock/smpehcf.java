package hackerblock;

import java.util.Scanner;

public class smpehcf {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in) ;
        int n=s.nextInt() ;
        int[] arr  =new int[n] ;
        for (int i = 0; i < n; i++) {
            arr[i]=s.nextInt();
        }
        if (n==1)
        {
            System.out.println(arr[0]);
            return;
        }
        int a = gcd(arr[0] ,arr[1]);
        for (int i = 2; i <n ; i++) {
            a =gcd(a ,arr[i]) ;
        }
        System.out.println(a);
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
