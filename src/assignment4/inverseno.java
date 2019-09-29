package assignment4;

import java.util.Arrays;
import java.util.Scanner;

public class inverseno {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        System.out.println("enter the size of an array ");
        int n =s.nextInt() ;
        int arr[]  = new int[n] ;
        System.out.println("enter the sorted array ") ;
        for(int i=0;i<arr.length ; i++)
        {
            arr[i] = s.nextInt() ;
        }
        System.out.println(Arrays.toString(inverse(arr)));
    }
    public static int[] inverse(int arr[])
    {
            int arr1[]= new int[arr.length] ;
        for (int i = 0; i < arr.length; i++) {
             int t = arr[i] ;
             arr1[t]=i ;
        }
        return arr1 ;
    }
}
