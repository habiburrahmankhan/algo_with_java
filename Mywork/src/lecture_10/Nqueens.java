package lecture_10;

public class Nqueens {
    public static void main(String[] args) {
        int n=4;
        boolean board[][]=new boolean[n][n];
        nqueens(board , 0);

    }
    public static void nqueens(boolean board[][] , int row )
    {
        if (row==board.length)
        {
            display(board) ;
            return ;
        }

        for (int col = 0; col <board.length ; col++) {
            if (isSafe(board ,row,col))
            {
                board[row][col]=true ;
                nqueens(board ,row+1);
                board[row][col]=false;

            }




        }

    }
    public static void display(boolean[][] board)
    {
        for (int i = 0; i <board.length ; i++) {
            for (int j = 0; j <board.length ; j++) {
                if (board[i][j]){
                    System.out.print("Q");
                }
                else
                {
                    System.out.print("X");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    public  static boolean isSafe(boolean board[][],int row ,int col)
    {
        for (int i = 0; i <row ; i++) {
            if (board[i][col])
            {
                return false;
            }
        }
       int left_dia=Math.min(row ,col) ;
        for (int i = 1; i <=left_dia ; i++) {
            if (board[row-1][col-1])
            {
                return false ;
            }
        }
        int right_dia=Math.min(row ,board.length -col-1 ) ;
        for (int i = 1; i <=right_dia ; i++) {
            if (board[row-1][col+1])
            {
                return false ;
            }

        }
        return true ;
    }
}
