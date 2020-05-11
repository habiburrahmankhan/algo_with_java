package DP;

import java.util.Arrays;
import java.util.Scanner;

public class knapsack0_1 {
    static  int[][] t = new int[1001][1001];
    public static void main(String[] args) {

        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j <t.length ; j++) {
                t[i][j] = -1 ;
            }
        }
        Scanner s = new Scanner(System.in) ;
        int n = s.nextInt();
        int w = s.nextInt();
        int[] wei = new int[n];
        int[] val = new int[n];
        for (int i = 0; i <n ; i++) {
            val[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) {
            wei[i] = s.nextInt();
        }

        int profit = knapsack(val , wei , w , n );
        System.out.println(profit);
    }

    private static int knapsack(int[] val, int[] wei, int w, int n) {
        if (n==0 | w==0)
        {
            return 0 ;
        }
        if (t[n][w]!=-1)
        {
            return t[n][w] ;
        }
        if (wei[n-1] <=w)
        {
            return t[n][w] = Math.max(val[n-1] + knapsack(val , wei , w-wei[n-1], n-1) , knapsack(val , wei , w , n-1));
        }
        else
        {
            return t[n][w] = knapsack(val , wei , w , n-1) ;
        }
    }
}
//4
//        7
//        1 4 5 7
//        1 3 4 5