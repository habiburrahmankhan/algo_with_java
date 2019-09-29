package assignment6;

import java.util.Arrays;
import java.util.Scanner;

public class selectionsortrec {
    public static void main(String[] args) {
        int arr[] = new int[5] ;
        Scanner s = new Scanner(System.in) ;

        for (int i = 0; i < arr.length ; i++) {
            System.out.println("enter the value in array ");
            arr[i] = s.nextInt() ;
        }
        selectionsort(arr , 0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void selectionsort(int arr[] , int i ,int j )
    {
        if (j==-1)
        {
            return;
        }
          int maxi=max(arr , i , j);
          swap(arr ,maxi ,j);
          selectionsort(arr , i ,j-1);

    }
    public static int max(int arr[] ,int i , int j)
    {
        int max=0;
        for (int k = i+1; k <=j ; k++) {
            if (arr[max]<arr[k])
            {
                max=k;
            }
        }
        return max ;
    }
    public static void swap(int arr[] ,int i,int j)
    {
        int temp=arr[i] ;
        arr[i]=arr[j];
        arr[j]=temp ;
    }
}
