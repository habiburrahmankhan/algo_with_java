package assignment4;

import java.util.Arrays;
import java.util.Scanner;

public class selectionsort {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in) ;
        System.out.println("enter the size of an array ");
        int n =s.nextInt() ;
        int arr[]  = new int[n] ;
        System.out.println("enter the array ") ;
        for(int i=0;i<arr.length ; i++)
        {
            arr[i] = s.nextInt() ;
        }
        System.out.println(Arrays.toString(selectionsort(arr)));
    }
    public static int[] selectionsort(int arr[])
    {
        for (int i = 0; i < arr.length ; i++) {
            int max = maximum(arr ,0 ,arr.length-1-i) ;
            swap(arr ,max ,arr.length-1-i) ;
        }
        return arr ;
    }

    public static int maximum(int arr[] , int start , int last )
    {
        int max=start;
        for (int i = start ; i <=last ; i++) {
            if (arr[max]<arr[i])
            {
                max=i ;
            }
        }
        return max ;
    }
    public static void swap(int arr[] , int start , int last )
    {
        int temp ;
        temp=arr[start] ;
        arr[start] = arr[last] ;
        arr[last]=temp ;
    }
}
