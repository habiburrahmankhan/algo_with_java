package assignment6;

import java.util.Scanner;

public class checkpalidrome {
    public static void main(String[] args) {
        int arr[] = new int[5] ;
        Scanner s = new Scanner(System.in) ;

        for (int i = 0; i < arr.length ; i++) {
            System.out.println("enter the value in array ");
            arr[i] = s.nextInt() ;
        }
        System.out.println(palidrome(arr , 0, arr.length-1)) ;
    }
    public static boolean palidrome(int arr[] , int start , int end)
    {
         if (start<=end)
         {
             return true ;
         }
         if (arr[start]!=arr[end])
         {
             return false ;
         }
         return palidrome(arr , start+1 ,end-1) ;
    }
}
