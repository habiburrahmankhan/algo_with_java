package DP;

import java.util.Scanner;

public class maxNoOfWaysCoinChange {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int sum = s.nextInt();
        int coin[] = new int[n];
        for (int i = 0; i <n ; i++) {
            coin[i] = s.nextInt();
        }

        int max = maxNoOfWays(coin , sum) ;
        System.out.println(max);
    }

    private static int maxNoOfWays(int[] coin, int sum) {
        int t[][] = new int[coin.length +1 ][sum +1] ;
        for (int i = 0; i <coin.length ; i++) {
            t[i][0] = 1 ;
        }
        for (int i = 0; i <sum+1 ; i++) {
            t[0][i] = 0 ;
        }

        for (int i = 1; i < coin.length +1 ; i++) {
            for (int j = 1; j <sum +1  ; j++) {
                if (coin[i-1] <= j)
                {
                    t[i][j] = t[i-1][j]  + t[i][j-coin[i-1]] ;
                }
                else
                {
                    t[i][j] = t[i-1][j] ;
                }
            }
        }
        return  t[coin.length][sum] ;

    }
}
