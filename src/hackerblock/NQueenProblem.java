package hackerblock;

import java.util.Scanner;

public class NQueenProblem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        boolean board[][] = new boolean[n][n];
        System.out.println(countNqueens(board , 0) );
    }

    private static int countNqueens(boolean[][] board , int row) {
     if (row==board.length)
     {
         return 1 ;
     }
      int count=0;
        for (int i = 0; i <board[row].length ; i++) {
             if (isSafe(board , row ,i))
             {
                 board[row][i] = true ;
                 count+= countNqueens(board , row + 1);
                 board[row][i]=false;
             }
        }
        return count ;
    }
     public  static boolean isSafe(boolean board[][] , int row ,int col)
     {
         for (int i = row-1; i >=0 ; i--) {
             if (board[i][col])
             {
                 return false ;
             }
         }
         for (int i = row-1 ,j=col-1; i>=0 &&j>=0 ; i-- ,j--) {
             if (board[i][j])
             {
                 return false ;
             }
         }
         for (int i = row-1 ,j=col+1; i>=0 &&j<board.length ; i-- ,j++) {
             if (board[i][j])
             {
                 return false ;
             }
         }





         return true;
     }
}
