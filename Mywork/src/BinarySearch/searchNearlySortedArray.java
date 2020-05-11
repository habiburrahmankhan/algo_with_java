package BinarySearch;

import java.util.Scanner;

public class searchNearlySortedArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        int n = s.nextInt();
        int search = s.nextInt();
        int arr[] = new int[n]  ;
        for (int i = 0; i <n ; i++) {
            arr[i] = s.nextInt();
        }
        int bool = binarySearch(arr , search);
        System.out.println((bool !=-1 ) ? "Match found " + bool : "Not found ") ;
    }

    private static int binarySearch(int[] arr, int search) {
        int start = 0 , end = arr.length -1 ;
        while(start <= end)
        {
            int mid = start + (end - start) /2 ;
            if (mid + 1 < arr.length && arr[mid+1]==search)
            {
                return mid+1 ;
            }else  if(mid-1 >= 0 && arr[mid -1 ] == search)
            {
                return mid -1  ;
            }
            else  if(arr[mid]==search)
            {
                return mid ;
            }
            else if (arr[mid] < search)
            {
                start = mid +2 ;
            }
            else
            {
                end = mid -2 ;
            }
        }
        return  -1 ;
    }
}
