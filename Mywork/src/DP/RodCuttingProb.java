package DP;

import java.util.Scanner;

public class RodCuttingProb {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int  leng[] = new int[N];
        int    price[] = new  int[N] ;
        for (int i = 0; i <leng.length ; i++) {
            leng[i] = s.nextInt();
        }
        for (int i = 0; i <price.length ; i++) {
            price[i] = s.nextInt();
        }
        int profit = RodCutting(price , leng , N);
        System.out.println(profit);
    }

    private static int RodCutting(int[] price, int[] leng, int n) {
        int[][] t = new int[n+1][leng.length +1 ];

        for (int i = 1; i <t.length ; i++) {
            for (int j = 1; j <t[i].length ; j++) {
                if (leng[i-1] > j)
                {
                    t[i][j] = t[i-1][j] ;
                }
                else
                {
                    t[i][j] = Math.max(price[i-1] + t[i][j-leng[i-1]] , t[i-1][j]) ;
                }
            }
        }
        return t[n][n];
    }
}
