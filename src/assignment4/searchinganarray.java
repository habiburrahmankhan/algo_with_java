package assignment4;

import java.util.Scanner;

public class searchinganarray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        int arr[]  = new int[5] ;
        System.out.println("enter the array ") ;
        for(int i=0;i<arr.length ; i++)
        {
            arr[i] = s.nextInt() ;
        }
        System.out.println("enter the value to search   ") ;
        int m = s.nextInt() ;
        System.out.println(searchanarray(arr , m));
    }
    public static int searchanarray(int arr[]  ,int m)
    {
        for (int i =0; i <arr.length ; i++) {
            if (arr[i]==m)
            {
                return i ;
            }
        }
        return -1 ;
    }
}
