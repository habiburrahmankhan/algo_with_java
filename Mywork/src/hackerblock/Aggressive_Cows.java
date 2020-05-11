package hackerblock;

import java.util.Arrays;
import java.util.Scanner;

public class Aggressive_Cows {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n  = s.nextInt();
        int c = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <arr.length ; i++) {
            arr[i] =s.nextInt();
        }
        System.out.println(mindistnce(arr , c));
    }
    public static int mindistnce(int arr[] , int c)
    {
        Arrays.sort(arr);
        int start = 0;
        int end = arr[arr.length -1 ] - arr[0] ;
        int final_ans = 0;
        while(start <= end)
        {
            int mid = (start + end)/2 ;
            if (valuevalid(arr, mid , c))
            {
                final_ans = mid ;
                 end =mid -1 ;
            }
            else
            {
                start = mid + 1 ;
            }
        }
       return  final_ans ;
    }

    private static boolean valuevalid(int[] arr, int mid, int c) {
        c--;
        for (int i = 1; i <arr.length ; i++) {
            if(Math.abs(arr[i] - mid) >= mid)
            {
                c--;
            }
        }
        if (c==0)
        {
            return true ;
        }
        else
        {
            return  false ;
        }

    }
}
