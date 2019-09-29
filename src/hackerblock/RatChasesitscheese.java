package hackerblock;

import java.util.Scanner;

public class RatChasesitscheese {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        char charr[][] = new char[5][4];
        int arr[][] = new int[5][4];
        for (int i = 0; i <charr.length ; i++) {
            for (int j = 0; j <charr[i].length ; j++) {
                charr[i][j]=s.next().charAt(0);
            }
        }
        for (int i = 0; i <charr.length ; i++) {
            for (int j = 0; j <charr[i].length ; j++) {
                System.out.print(charr[i][j] + " ");
            }
            System.out.println();
        }
        rratcheesePath(charr ,0,n,0,m ,arr);
        if (arr[n][m]==1)
        {
            for (int i = 0; i <arr.length ; i++) {
                for (int j = 0; j <arr[i].length ; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
        else
        {
            System.out.println("NO PATH FOUND");
        }
       }

    private static void rratcheesePath(char[][] charr , int sr ,int er,int sc,int ec ,int[][] arr) {
        if (sr==er && ec==sc)
        {
            return;
        }

        if (sr >er || sc > ec)
        {
            return ;
        }
        if (charr[sr][sc]!='X')
        {
            arr[sr][sc]=1;
            rratcheesePath(charr,sr+1,er,sc,ec,arr);
            arr[sr][sc]=1;
            rratcheesePath(charr,sr,er,sc+1,ec,arr);
        }
    }

}
//5 4
//        OXOO
//        OOOX
//        XOXO
//        XOOX
//        XXOO