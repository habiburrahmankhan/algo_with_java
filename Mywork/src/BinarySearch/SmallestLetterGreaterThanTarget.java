package BinarySearch;

import java.util.Scanner;

public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        char search = s.next().charAt(0);
        char arr[] = new char[n]  ;
        for (int i = 0; i <n ; i++) {
            arr[i] = s.next().charAt(0);
        }
        char bool = binarySearch(arr , search);
        System.out.println((bool !='#' ) ? "Match found " + bool : "Not found ") ;
    }

    private static char binarySearch(char[] arr, int search) {
        int start = 0 , end = arr.length -1 ;
        char res = '#' ;
        while ( start <= end )
        {
            int mid = start + ( end - start ) / 2 ;
            if (arr[mid]==search)
            {
                start = mid + 1 ;
            }
            else if (arr[mid] < search)
            {
                start = mid + 1 ;
            }
            else
            {
                res = arr[mid] ;
                end = mid  - 1 ;
            }
        }
        return  res ;
    }
}
