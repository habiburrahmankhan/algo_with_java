package hackerblock;

import java.util.Scanner;

public class Knapsack_0_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n =scan.nextInt();
        int s =scan.nextInt() ;
        int item[] = new int[n];
        int value[]  = new int[n] ;
        int dp[][] =  new int[n+1][s+1];
        for (int i = 0; i < item.length; i++) {
            item[i] = scan.nextInt();
        }
        for (int i = 0; i < value.length; i++) {
            value[i] = scan.nextInt();
        }
        System.out.println(knapsack(item,value , s ,dp));
    }

    private static int knapsack(int[]item, int[] value, int s ,int dp[][]) {
        int total_sum =0 ;
        for (int i = 0; i <item.length ; i++) {
            total_sum = item[i];
        }

        for (int i = 0; i <=s ; i++) {
            dp[0][i]=0;
        }
        for (int i = 0; i <dp.length ; i++) {
            dp[i][0]=0;
        }

        for (int i = 1; i <dp.length; i++) {


            for (int j = 1; j <dp[i].length ; j++) {
                int inc =0 ,exc = 0;
               if (item[i-1]<=j)
               {
                   inc= dp[i-1][j-item[i-1]] + value[i-1];
               }
                  exc =dp[i-1][j];

               dp[i][j] = Math.max(inc ,exc) ;
            }
        }
//        for (int i = 0; i <dp.length; i++) {
//            for (int j = 0; j <dp[i].length ; j++) {
//                System.out.print(dp[i][j] + "       ");
//            }
//            System.out.println();
//        }


        return dp[item.length-1][s] ;
    }
}
