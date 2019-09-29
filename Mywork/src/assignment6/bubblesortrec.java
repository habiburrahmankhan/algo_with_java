package assignment6;

import java.util.Arrays;
import java.util.Scanner;

public class bubblesortrec {
    public static void main(String[] args) {
        int arr[] = new int[5] ;
        Scanner s = new Scanner(System.in) ;

        for (int i = 0; i < arr.length ; i++) {
            System.out.println("enter the value in array ");
            arr[i] = s.nextInt() ;
        }
        bubblesort(arr,0);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubblesort(int arr[] ,int i)
    {
           if (i==arr.length)
           {
               return ;
           }
           bubblesort(arr,i+1);
           int j=0;
           while(j<i)
           {
               swapfn(arr,j,j+1);
               j++;
           }


    }
    public static void swapfn(int arr[] ,int i ,int j)
    {
        if(arr[i] > arr[j])
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
}
