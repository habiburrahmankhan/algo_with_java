package lecture_11;

import java.util.Arrays;
import java.util.Scanner;

public class Quicksortalgo {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in) ;
        int arr[]={5,4,6,3,2} ;

         quicksort(arr,0,arr.length );
        System.out.println(Arrays.toString(arr));
    }
    public static void quicksort(int arr[] ,int start , int end )
    {
        if (end<=start)
        {
            return ;

        }
        int pivot=end -1 ;
        pivot=pivotadjust(arr,start,end ,pivot) ;
        quicksort(arr,0,pivot);
        quicksort(arr ,pivot+1,end);

    }

    public static int pivotadjust(int arr[] , int start , int end ,int pivot)
    {
        int i=start;
        int j=start;
        int temp ;
        for (int k = start; k <pivot ; k++) {
            if (arr[k] < arr[pivot])
            {
                temp=arr[k];
                arr[k]=arr[j];
                arr[j]=temp ;
                j++;
            }
        }
        temp=arr[pivot];
        arr[pivot]=arr[j];
        arr[j]=temp ;

        return j;
    }

}
