package assignment4;

import java.util.Scanner;

public class maximumvalue {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in) ;
        int arr[]  = new int[5] ;
        System.out.println("enter the array ") ;
        for(int i=0;i<arr.length ; i++)
        {
            arr[i] = s.nextInt() ;
        }
        System.out.println("enter the starting array Index  ") ;
        int start = s.nextInt() ;
        System.out.println("enter the end array Index  ") ;
        int last = s.nextInt() ;
        System.out.println(maximum(arr , start , last ));
    }

    public static int maximum(int arr[] , int start , int last )
    {
        int max=arr[start] ;
        for (int i = start ; i <=last ; i++) {
            if (max<arr[i])
            {
                max=arr[i] ;
            }
        }
        return max ;
    }
}
