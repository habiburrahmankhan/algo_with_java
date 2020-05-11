package hackerblock;



/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

public class Return_two_prime_numbers {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in)  ;
        boolean arr[]  = new boolean[10000 + 1 ] ;
        check_Prime(arr) ;
      //  System.out.println(Arrays.toString(arr));
        int t = s.nextInt() ;

        for( int i = 0 ; i < t ; i++)
        {
            int n = s.nextInt() ;
            isPrime(n , arr) ;
        }
    }
    public static void isPrime(int n , boolean arr[])
    {
        int i = 0  , j = n ;
        while(i<=j)
        {
            if(!arr[i] && !arr[j] )
            {
                if(i + j == n)
                {
                    System.out.println(i +" "+ j) ;
                    break ;
                }
            }
            i++ ;
            j--;
        }
    }
    public static void check_Prime(boolean[] arr)
    {
        arr[0] = true ; arr[1] = true ;
        for(int i = 2 ; i < arr.length ; i++)
        {
            if(!arr[i])
            {
                for(int j = 2*i ; j < arr.length ; j+=i)
                {
                    arr[j] = true ;
                }
            }
        }

    }
}