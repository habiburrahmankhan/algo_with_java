package hackerblock;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class targetsum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        int n =s.nextInt() ;
        int arr[]  = new int[n] ;
        for(int i=0;i<arr.length ; i++)
        {
            arr[i] = s.nextInt() ;
        }
        int m = s.nextInt() ;
        target(arr , m) ;
    }

    public static void target(int arr[] , int m) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length -1 ; i++) {
            int start = i+1;
            int end = arr.length - 1;
            while (start < end) {
                if (arr[start] + arr[end] == m - arr[i]) {
                    System.out.println( arr[i]+ ", "+ arr[start] + " and " + arr[end]);
                    start++;
                    end--;

                } else if (arr[start] + arr[end] > m - arr[i]) {
                    end--;

                }
                else
                    {
                    start++;
                }
            }
        }
    }
    }
