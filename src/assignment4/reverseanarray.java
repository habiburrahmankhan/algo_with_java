package assignment4;

import java.util.Arrays;
import java.util.Scanner;

public class reverseanarray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        System.out.println("enter the size of an array ");
        int n =s.nextInt() ;
        int arr[]  = new int[n] ;
        System.out.println("enter the  array ") ;
        for(int i=0;i<arr.length ; i++)
        {
            arr[i] = s.nextInt() ;
        }
        System.out.println(Arrays.toString(reverse(arr)));
    }
    public static  int[] reverse(int arr[])
    {
        int temp ;
        for (int i = 0; i <arr.length/2 ; i++) {
            temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length -1-i]=temp ;
        }
        return arr;
    }
}
