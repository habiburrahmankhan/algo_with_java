package BinarySearch;

import java.util.Scanner;

public class FindElementInRotatedArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int search = s.nextInt();
        int arr[] = new int[n]  ;
        for (int i = 0; i <n ; i++) {
            arr[i] = s.nextInt();
        }
        int bool = binarySearchmin(arr , 0 , arr.length -1 );
        System.out.println(bool);
            int a =         binarySearch(arr , search, 0 , bool -1 );
             int b =        binarySearch(arr ,search, bool , arr.length -1 ) ;
        System.out.println((a!=0 && b!=0) ? " Match found " + ( (a!=-1) ? a: b ) : "Not Found ");
    }

    private static int binarySearchmin(int[] arr , int start , int end ) {

        while ( start <= end )
        {
            int mid = start + ( end - start ) / 2 ;
            int next = (mid + 1 )%arr.length ;
            int prev = (mid +arr.length - 1 )%arr.length ;
            if (arr[mid] <= arr[prev] && arr[mid] <= arr[next])
            {
                return mid ;
            }
            else if (arr[mid] >= arr[start])
            {
                start = mid + 1 ;
            }
            else if (arr[mid] <= arr[end])
            {
                end = mid  - 1 ;
            }

        }
        return  0 ;
    }
    private static int binarySearch(int[] arr, int search , int start , int end) {

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
