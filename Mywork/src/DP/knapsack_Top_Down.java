package DP;

import java.util.Scanner;

public class knapsack_Top_Down {
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


    public static int knapsack(int val[] , int[] wei , int w  , int n)
    {
        for(int i =0 ; i <t.length ; i++ )
        {
            t[i][0] = 0 ;
        }
        for(int i =1 ; i < t[0].length ; i++)
        {
            t[0][i] = 0 ;
        }
        for(int i = 1 ; i < n+1 ; i++)
        {
            for(int j =0 ;j < w+1 ; j++)
            {
                if(wei[i-1] <= j)
                {
                    t[i][j] = Math.max( val[i-1]+ t[i][j -wei[i-1]] , t[i-1][j]);
                }
                else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[n][w];
    }
}
