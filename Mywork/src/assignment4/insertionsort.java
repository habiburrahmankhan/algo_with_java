package assignment4;

import java.util.Arrays;
import java.util.Scanner;

public class insertionsort {
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
        insertion(arr) ;
        for(int i=0;i<arr.length ; i++)
        {
            System.out.println(arr[i]) ;
        }
    }
    public static void insertion(int arr[])
    {
        for (int i = 0; i <arr.length -1 ; i++) {
            for (int j = i+1; j > 0 ; j--) {
                if (arr[j] < arr[j-1])
                {
                    int temp;
                    temp=arr[j-1] ;
                    arr[j-1]=arr[j] ;
                    arr[j]=temp ;
                }
                else
                {
                    break ;
                }
            }
        }
    }
}
