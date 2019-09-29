package assignment4;

import java.util.Arrays;
import java.util.Scanner;

public class bubblesort {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in) ;
      //  System.out.println("enter the size of an array ");
        int n =s.nextInt() ;
        int arr[]  = new int[n] ;
      //  System.out.println("enter the sorted array ") ;
        for(int i=0;i<arr.length ; i++)
        {
            arr[i] = s.nextInt() ;
        }
        System.out.println(Arrays.toString(bublesort(arr)));

    }
    public static int[] bublesort(int arr[])
    {
        int temp ;
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j <arr.length  -1-i ; j++) {
                if(arr[j] > arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1] ;
                    arr[j+1] = temp ;
                }
            }
        }
        return arr ;
    }
}
