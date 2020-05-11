package DP;

import java.util.Scanner;

public class matrixChainMultiplicationRecursive {
    public static void main(String[] args) {
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
        int mn = Integer.MAX_VALUE ;
        for (int k = i; k <j-1 ; k++) {
            int temp = matrixChainMultiplication(arr , i , k ) + matrixChainMultiplication(arr , k+1 ,j ) + arr[i]*arr[k]*arr[k] ;
            if (temp < mn)
            {
                temp = mn ;
            }
        }
        return  mn ;
    }
}
