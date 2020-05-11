package DP;

import java.util.Scanner;

public class equalsumpartition {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        int sum =0 ;
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = s.nextInt();
            sum+=arr[i] ;
        }
        sum*=2;
        boolean ans = equalsumpartitionfunc(arr , sum/2) ;
        System.out.println(ans);


    }

    private static boolean equalsumpartitionfunc(int[] arr, int sum) {
        if (sum%2!=0)
        {
            return false ;
        }
        else
        {
            boolean[][]  dp = new boolean[arr.length + 1 ][sum +1] ;
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
                for(int j =0 ;j < dp[0].length ; j++)
                {
                    if(arr[i-1] <= j)
                    {
                        dp[i][j] = dp[i][j -arr[i-1]] || dp[i-1][j];
                    }
                    else{
                        dp[i][j] = dp[i-1][j];
                    }
                }
            }
            return dp[dp.length-1][dp[0].length -1 ];
        }

    }
}
