package lecture3.lecture4;

import java.util.Arrays;
import java.util.Scanner;

public class selectionsort {
    public static void main(String[] args) {
        int arr[] = new int[5] ;
        Scanner s = new Scanner(System.in) ;

        for (int i = 0; i < arr.length ; i++) {
            System.out.println("enter the value in array ");
            arr[i] = s.nextInt() ;
        }
         selectionsort(arr) ;
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionsort(int arr[])
    {
        for (int i = 0; i < arr.length; i++)
        {
            int max =maxelement.max(arr ,0,arr.length-i-1) ;
            swaparray.swap(arr,max , arr.length-i-1);
        }
    }

}
