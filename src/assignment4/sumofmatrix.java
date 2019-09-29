package assignment4;

import java.util.Arrays;
import java.util.Scanner;

public class sumofmatrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        System.out.println("enter the size of an array ");
        int n =s.nextInt() ;
        int arr1[]  = new int[n] ;
        System.out.println("enter the array ") ;
        for(int i=0;i<arr1.length ; i++)
        {
            arr1[i] = s.nextInt() ;
        }
        System.out.println("enter the size of an array ");
        int m =s.nextInt() ;
        int arr2[]  = new int[m] ;
        System.out.println("enter the sorted array ") ;
        for(int i=0;i<arr2.length ; i++)
        {
            arr2[i] = s.nextInt() ;
        }
        summatrix(arr1 , arr2 );
    }
    public static void summatrix(int arr1[] ,int arr2[])
    {


    }
}
