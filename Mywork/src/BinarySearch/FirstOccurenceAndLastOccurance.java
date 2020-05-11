package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class FirstOccurenceAndLastOccurance {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int search = s.nextInt();
        int arr[] = new int[n]  ;
        for (int i = 0; i <n ; i++) {
            arr[i] = s.nextInt();
        }
        int bool[] = binarySearch(arr , search);
        if (bool[0]==-1)
        {
            System.out.println("no match found ");
        }
        else
        {
            System.out.println(bool[0]  + " to " + bool[1] + " match found ") ;
        }

    }

    private static int[] binarySearch(int[] arr, int search) {
        int start = 0 , end = arr.length -1 ;
        int res[] = new int[2] ;
        Arrays.fill(res , -1);
        while ( start <= end )
        {
            int mid = start + ( end - start ) / 2 ;
            if (arr[mid]==search)
            {
                res[0] = mid ;
                end = mid -1 ;
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
        start = 0 ;  end = arr.length -1 ;
        while ( start <= end )
        {
            int mid = start + ( end - start ) / 2 ;
            if (arr[mid]==search)
            {
                res[1] = mid ;
                start = start + 1 ;
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


        return  res ;
    }
}
