package DP;

import java.util.Scanner;

public class targetSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int diff = s.nextInt() ;
        int arr[] = new int[n];
        int sum = 0 ;
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = s.nextInt();
            sum+=arr[i] ;
        }
        sum = (diff + sum ) /2 ;
        int count =  countSubsetwithGivenDifference(arr, sum);
        System.out.println(count);

    }

    private static int countSubsetwithGivenDifference(int[] arr, int sum) {
        int[][] dp = new int[arr.length + 1][sum + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i < dp[0].length; i++) {
            dp[0][i] = 0;
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (arr[i - 1] <= j) {
                    dp[i][j] = dp[i-1][j - arr[i - 1]] + dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        for (int i = 0; i <dp.length ; i++) {
            for (int j = 0; j <dp[0].length ; j++) {
                System.out.print(dp[i][j] + "  ");
            }
            System.out.println();
        }
        return dp[arr.length][sum];
    }
}
