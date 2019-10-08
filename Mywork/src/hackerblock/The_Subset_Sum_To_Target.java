package hackerblock;

import java.util.Scanner;

public class The_Subset_Sum_To_Target {
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);

            int n =s.nextInt();
            int arr[]= new int[n+1];
             int m =s.nextInt();
            for (int j = 1; j <arr.length; j++) {
                arr[j] = s.nextInt();
            }
            boolean dp[][] = new boolean[arr.length][m+1] ;
           if (MLBS(arr ,m ,dp))
           {
               System.out.println("Yes");
           }
           else
           {
               System.out.println("No");
           }

    }

    private static boolean MLBS(int[] arr , int n  , boolean[][] dp) {
        dp[0][0]= true ;
        for (int i = 1; i <=n ; i++) {
            dp[0][i]= false ;
        }
        boolean  icurrent_no  ;
        for (int i = 1; i <arr.length ; i++) {
            int sum =0 ;
            for (int k = 0; k <=i ; k++) {
                sum+=arr[k];
            }
            for (int j = 0; j <=n; j++) {

                if (arr[i] > j)
                {
                    icurrent_no = dp[i-1][j];
                }
                else
                {
                    icurrent_no = dp[i-1][j - arr[i]]  || dp[i-1][j];
                }
                    dp[i][j] = icurrent_no;
             }
        }
            for (int j = 0; j <=n; j++) {
                System.out.print(j + "                   ");
            }
            System.out.println();
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <=n; j++) {
                System.out.print(dp[i][j] +  "               ");
            }
            System.out.println();
        }
        return  dp[arr.length -1][n] ;
    }


}
//5 10 1 2 3 4 5

