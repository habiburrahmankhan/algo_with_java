package BinarySearch;



import java.util.Scanner;

public class BinarySearchAlgo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
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
