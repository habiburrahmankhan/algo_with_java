package BinarySearch;

import java.util.Scanner;

public class IndexOfFirst_1_BinarySortedInfiniteArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n]  ;
        for (int i = 0; i <n ; i++) {
            arr[i] = s.nextInt();
        }
        int start = 0 ;
        int end = 1 ;
        while(arr[end]< 1)
        {
            start = end ;
            end = end * 2 ;
        }
        int bool = binarySearch(arr , 1 ,  start , end);

        System.out.println((bool !=-1 ) ? "Match found " + bool : "Not found ") ;
    }

    private static int binarySearch(int[] arr, int search , int start , int end ) {


        while ( start <= end )
        {
            int mid = start + ( end - start ) / 2 ;
            if (arr[mid]==search)
            {
                return mid ;
            }
            else if (arr[mid] < search)
            {
                start = mid + 1 ;
            }
            else
            {
                end = mid  - 1 ;
            }
        }
        return  -1 ;
    }
}
