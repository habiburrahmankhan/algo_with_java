package assignment4;

import java.util.Scanner;

public class spiralmatrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        int arr[][] = new int[3][3] ;

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.println("enter the arrays ");
                arr[i][j]=s.nextInt() ;
            }
        }
        spiralclock_wise(arr);
//        for (int i = 0; i <arr.length ; i++) {
//            for (int j = 0; j <arr[i].length ; j++) {
//                System.out.print(arr[i][j]);
//            }
//            System.out.println();
//        }

    }
    public static void spiralclock_wise(int arr[][])
    {
        int left =0 ;
        int top=0;
        int right= arr.length-1 ;
        int bottom = arr.length-1 ;

        while(top<=bottom && left<=right)
        {
            for (int i = left; i <=right ; i++) {
                System.out.print(arr[top][i] + " ");
            }
            top++;
            for (int i = top; i <=right ; i++) {
                System.out.print(arr[i][right] + " ");
            }
            right-- ;
            for (int i = right; i >=left ; i--) {
                System.out.print(arr[bottom][i] + " ");
            }
            bottom-- ;
            for (int i = bottom; i >left ; i--) {
                System.out.print(arr[i][left] + " ");
            }
            left++ ;

        }
    }
}
