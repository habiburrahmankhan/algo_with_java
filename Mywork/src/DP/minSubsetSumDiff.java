package DP;

import java.util.ArrayList;
import java.util.Scanner;

public class minSubsetSumDiff {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        int range = 0 ;
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = s.nextInt();
            range+=arr[i] ;
        }
        minSubsetSumdifference( arr  ,range);

    }

    private static void minSubsetSumdifference(int[] arr, int range) {
        boolean[][]  dp = new boolean[arr.length + 1 ][range +1] ;
        for(int i =0 ; i <dp.length ; i++ )
        {
            dp[i][0] = true ;
        }
        for(int i =1 ; i < dp[0].length ; i++)
        {
            dp[0][i] = false ;
        }
        for(int i = 1 ; i < dp.length ; i++)
        {
            for(int j =1;j < dp[0].length ; j++)
            {
                if(arr[i-1] <= j)
                {
                    dp[i][j] = dp[i-1][j -arr[i-1]] || dp[i-1][j];
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        ArrayList<Integer> range_element = new ArrayList<>();
        for (int i = 0; i < (range+1)/2 ; i++) {
            if (dp[arr.length][i])
            {
                range_element.add(i) ;
            }
        }
        int min = Integer.MAX_VALUE ;
        for (int i = 0; i <range_element.size() ; i++) {
            min = Math.min(min , range - 2*range_element.get(i)) ;
        }
        System.out.println(min);
    }
}
