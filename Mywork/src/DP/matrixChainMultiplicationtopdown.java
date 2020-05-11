package DP;

import java.util.Arrays;
import java.util.Scanner;

public class matrixChainMultiplicationtopdown {
     static int t[][] = new int[1001][1001];

    public static void main(String[] args) {
        for(int[] a : t)
        {
            Arrays.fill(a , -1);
        }
        Scanner s  = new Scanner(System.in) ;
        int n = s.nextInt();
        int arr[] = new int[n] ;
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = s.nextInt() ;
        }
        int cost = matrixChainMultiplication(arr , 1 , arr.length -1 );
        System.out.println(cost);
    }

    private static int matrixChainMultiplication(int[] arr, int i, int j) {
        if (i>=j)
        {
            return 0 ;
        }
        if (t[i][j]!=-1)
        {
            return t[i][j] ;
        }
        int mn = Integer.MAX_VALUE ;
        for (int k = i; k <j-1 ; k++) {
            int temp = matrixChainMultiplication(arr , i , k ) + matrixChainMultiplication(arr , k+1 ,j ) + arr[i]*arr[k]*arr[k] ;
            if (temp < mn)
            {
                temp = mn ;
            }
        }
        return  t[i][j] = mn ;
    }
}
