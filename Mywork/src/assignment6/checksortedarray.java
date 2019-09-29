package assignment6;

import java.util.Arrays;
import java.util.Scanner;

public class checksortedarray {
    public static void main(String[] args) {
        int arr[] = new int[5] ;
        Scanner s = new Scanner(System.in) ;

        for (int i = 0; i < arr.length ; i++) {
            System.out.println("enter the value in array ");
            arr[i] = s.nextInt() ;
        }
        System.out.println(checksort(arr ,0));
        System.out.println(Arrays.toString(arr));
    }
    public static boolean checksort(int arr[] ,int i)
    {
        if (i==arr.length-1)
        {
            return true ;
        }
        if (arr[i] >arr[i+1] )
        {
            return false ;
        }

         return  checksort(arr , i+1) ;

    }
}
