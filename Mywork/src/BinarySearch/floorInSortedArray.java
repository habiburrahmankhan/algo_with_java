package BinarySearch;

import java.util.Scanner;

public class floorInSortedArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
    int n = s.nextInt();
    int search = s.nextInt();
    int arr[] = new int[n]  ;
        for (int i = 0; i <n ; i++) {
        arr[i] = s.nextInt();
    }
    int bool = binarySearch(arr , search);
        System.out.println(" floor is "  + bool) ;
}

    private static int binarySearch(int[] arr, int search) {
        int start = 0 , end = arr.length -1 ;
        int result = 0 ;
        while ( start <= end )
        {
            int mid = start + ( end - start ) / 2 ;
            if (arr[mid]==search)
            {
                return arr[mid] ;
            }
            else if (arr[mid] < search)
            {
                result = arr[mid] ;
                start = mid + 1 ;
            }
            else

            {

                end = mid  - 1 ;
            }
        }
        return  result;
    }
}
