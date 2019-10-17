package hackerblock;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Quick_Sort {
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        long ar[]=new long[n];
        for (int i = 0; i <n ; i++) {
            ar[i]=in.nextLong();
        }
        RandomizedArray(ar);
        QuickSort(ar,0,ar.length);
        for (int i = 0; i <n ; i++) {
            System.out.print(ar[i]+" ");
        }
    }
    private static void RandomizedArray(long[] ar)
    {
        for (int i = 0; i <ar.length ; i++) {
            int j=(int)(Math.random()*10%ar.length);
            long temp=ar[j];
            ar[j]=ar[i];
            ar[i]=temp;
        }
    }
    private static void QuickSort(long[] ar,int start,int end)
    {
        if(start>=end)
        {
            return;
        }
        int pivot=end-1;
        pivot=pivotadjust(ar,start,end-1);
        QuickSort(ar,start,pivot);
        QuickSort(ar,pivot+1,end);
    }

    private static int pivotadjust(long [] ar,int start,int pivot) {
        int j=start;
        for (int i = start; i <=pivot ; i++) {
            if(ar[i]<ar[pivot]){
                long temp=ar[i];
                ar[i]=ar[j];
                ar[j]=temp;
                j++;
            }
        }
        long temp=ar[j];
        ar[j]=ar[pivot];
        ar[pivot]=temp;
        return j;
    }

    //    public static int[] RandomizeArray(int[] array){
//        Random rgen = new Random();  // Random number generator
//
//        for (int i=0; i<array.length; i++) {
//            int randomPosition = rgen.nextInt(array.length);
//            int temp = array[i];
//            array[i] = array[randomPosition];
//            array[randomPosition] = temp;
//        }
//
//        return array;
//    }

//    private static void quicksort(int[] arr, int lo, int hi) {
//        if (lo>=hi)
//        {
//            return;
//        }
//        int mid = (lo + hi)/2 ;
//         int pivot = arr[mid] ;
//         int left = lo ;
//         int right = hi ;
//
//         while (left<=right)
//         {
//             while (arr[left] <  pivot)
//             {
//                 left++;
//             }
//             while (arr[right]  >pivot)
//             {
//                 right--;
//             }
//             if (left<=right)
//             {
//                 int temp = arr[left];
//                 arr[left] = arr[right];
//                 arr[right] = temp ;
//                 left++;
//                 right--;
//             }
//             quicksort(arr,lo , right);
//             quicksort(arr , left , hi );
//         }
//
//    }
}
