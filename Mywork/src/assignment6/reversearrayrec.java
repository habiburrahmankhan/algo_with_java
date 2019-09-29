package assignment6;

import java.util.Arrays;
import java.util.Scanner;

public class reversearrayrec {
    public static void main(String[] args) {
        int arr[] = new int[4] ;
        Scanner s = new Scanner(System.in) ;

        for (int i = 0; i < arr.length ; i++) {
            System.out.println("enter the value in array ");
            arr[i] = s.nextInt() ;
        }
        reverse(arr , 0, arr.length-1);
        System.out.println(Arrays.toString(arr)) ;
    }
    public static void reverse(int arr[] , int start , int end)
    {
        if (start>=end)
        {
            return  ;
        }
        swapfn(arr,start,end);
       reverse(arr , start+1 ,end-1) ;
    }
    public static void swapfn(int arr[] , int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp ;
    }

}
