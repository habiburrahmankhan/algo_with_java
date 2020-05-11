package BinarySearch;

import java.util.Scanner;

public class NoofTimesArrayisRotated {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n]  ;
        for (int i = 0; i <n ; i++) {
            arr[i] = s.nextInt();
        }
        int bool = binarySearch(arr);
        System.out.println(  bool ) ;
    }

    private static int binarySearch(int[] arr) {
        int start = 0 , end = arr.length - 1 ;

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
}
