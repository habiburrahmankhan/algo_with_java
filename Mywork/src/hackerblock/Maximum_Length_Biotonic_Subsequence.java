package hackerblock;

import java.util.Arrays;
import java.util.Scanner;

public class Maximum_Length_Biotonic_Subsequence {
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        int test = s.nextInt();
        for (int i = 0; i <test ; i++) {
            int n =s.nextInt();
            int arr[]= new int[n];
            int dp[]= new int[n];
            int dp1[]= new int[n];
            for (int j = 0; j <n ; j++) {
                arr[j]=s.nextInt();
                dp[j]=1 ;
                dp1[j]=1 ;
            }
           MLBS(arr ,dp);
        //    System.out.println(Arrays.toString(dp));
            MLBS1(arr ,dp1);
          //  System.out.println(Arrays.toString(dp1));
            int max=0;
            for (int j = 0; j < arr.length; j++) {
                dp[j]+=dp1[j] -1 ;
                if (dp[j]> max)
                {
                    max = dp[j];
                }
            }
            System.out.println(max);
        }
    }

    private static void MLBS(int[] arr , int [] dp  ) {
        for (int i = 1; i <arr.length ; i++) {
            for (int j = 0; j <i ; j++) {
                if (arr[i]>=arr[j])
                {
                    dp[i] = Math.max(1+ dp[j] , dp[i]);
                }
            }

        }

    }

    private static void MLBS1(int[] arr , int [ ] dp  ) {

        for (int i = arr.length -2; i>=0; i--) {
            for (int j = arr.length-1; j >i ; j--) {
                if (arr[i]>=arr[j])
                {
                    dp[i] = Math.max(1+ dp[j] , dp[i]);
                }
            }

        }

    }
}
//2
//        8
//        1 11 2 10 4 5 2 1
//        6
//        80 60 30 40 20 1