package DP;

import java.util.Scanner;

public class minNoOfCoinRequired {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int sum = s.nextInt();
        int coin[] = new int[n];
        for (int i = 0; i <n ; i++) {
            coin[i] = s.nextInt();
        }

        int max = minNoOfCoin(coin , sum) ;
        System.out.println(max);
    }

    private static int minNoOfCoin(int[] coin, int sum) {
        int t[][] = new int[coin.length +1 ][sum +1] ;
        for (int i = 1; i <coin.length ; i++) {
            t[i][0] =  0 ;
        }
        for (int i = 0; i <sum+1 ; i++) {
            t[0][i] = Integer.MAX_VALUE -1 ;
        }

        for (int i = 1; i <sum+1 ; i++) {
            if (i%coin[0]==0) {
                t[1][i] = sum/coin[0] ;
            }
            else
            {
                t[1][i] = Integer.MAX_VALUE -1 ;
            }
        }

        for (int i = 2; i <coin.length +1 ; i++) {
            for (int j = 2; j <sum+1 ; j++) {
                if (coin[i-1]<= j)
                {
                    t[i][j] = Math.min(t[i-1][j] , 1 + t[i][j-coin[i-1]]) ;
                }
                else
                {
                    t[i][j] = t[i-1][j] ;
                }

            }
        }
        return t[coin.length][sum] ;

    }
}
