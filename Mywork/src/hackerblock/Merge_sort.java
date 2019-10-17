package hackerblock;

import java.util.Arrays;
import java.util.Scanner;

public class Merge_sort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=s.nextInt();
        }
      int merge[] = mergesort(arr , 0 , arr.length-1);
        for (int i = 0; i <n ; i++) {
            System.out.print(merge[i] + " ");
        }
    }

    private static int[] mergetwosortedarray(int arr1[] , int[] arr2) {
        int merge[] = new  int[arr1.length + arr2.length] ;
        int i = 0 ;
        int j=0;
        int k=0 ;
        while (i < arr1.length && j< arr2.length)
        {
            if (arr1[i] >= arr2[j])
            {
                merge[k]=arr2[j];
                j++;
                k++;

            }
            else
            {
                merge[k]=arr1[i];
                i++;
                k++;
            }
        }
        if (j==arr2.length)
        {
            while (i<arr1.length)
            {
                merge[k]=arr1[i];
                i++;
                k++;
            }
        }
        if (i==arr1.length) {
            while (j < arr2.length) {
                merge[k] = arr2[j];
                j++;
                k++;
            }
        }
   return merge ;
    }
    private  static  int[] mergesort(int []arr , int lo  ,int hi)
    {
        if (lo==hi)
        {
            int br[] = new int[1];
            br[0] = arr[lo];
            return   br;
        }
        int mid = (lo + hi)/2 ;
        int firsthalf[] = mergesort(arr, lo , mid);
        int secondhalf[] = mergesort(arr ,mid+1 , hi);
        int merge[] = mergetwosortedarray(firsthalf , secondhalf);
        return merge;
    }
}
