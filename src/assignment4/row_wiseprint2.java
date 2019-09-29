package assignment4;

import java.util.Scanner;

public class row_wiseprint2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        int arr[][] = new int[4][4] ;

        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <4 ; j++) {
                System.out.println("enter the arrays ");
                arr[i][j]=s.nextInt() ;
            }
        }
        printvalue1(arr);
    }
    public static void printvalue1(int arr[][])
    {
        for (int i = 0; i < 4 ; i++) {
            int j ;
            if(i%2==0)
            {
                j=0;
            }
            else
            {
                j=3;
            }
            int k=1 ;
            while(k<=4)
            {
                System.out.println(arr[j][i] + " ");
                if(i%2==0)
                {
                    j++;
                }
                else
                {
                    j-- ;
                }
                k++ ;
            }
            System.out.println();
        }
    }
}
