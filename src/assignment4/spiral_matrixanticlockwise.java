package assignment4;

import java.util.Scanner;

public class spiral_matrixanticlockwise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        int arr[][] = new int[3][3] ;

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.println("enter the arrays ");
                arr[i][j]=s.nextInt() ;
            }
        }
        spiralanticlock_wise(arr);
    }
    public static void spiralanticlock_wise(int arr[][])
    {
        int left =0 ;
        int top=0;
        int right= arr.length-1 ;
        int bottom = arr.length-1 ;

        while(top<=bottom && left<=right)
        {
            for (int i = left; i <=right ; i++) {
                System.out.print(arr[i][top] + " ");
            }
            top++;
            for (int i = top; i <=right ; i++) {
                System.out.print(arr[right][i] + " ");
            }
            right-- ;
            for (int i = right; i >=left ; i--) {
                System.out.print(arr[i][bottom] + " ");
            }
            bottom-- ;
            for (int i = bottom; i >left ; i--) {
                System.out.print(arr[left][i] + " ");
            }
            left++ ;

        }
    }

}
