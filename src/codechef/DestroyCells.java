package codechef;

import java.util.Scanner;

public class DestroyCells {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int k = 0; k <t ; k++) {
            int n=s.nextInt();
            int m=s.nextInt();

            for (int i = 0; i <n*m; i++) {
                int arr[][] = new int[n][m];
                System.out.print(destroycell(arr ,i ,n,m) + " ");
            }

        }


    }
    public static int destroycell(int[][] arr ,int k ,int n,int m)
    {
        int count=0 ,j=0;
        for (int i = 0; i <n; i++) {
               while(j<m*(i+1)) {

                   arr[i][(j)%m] = 1;
                   j=(j+k+1);
               }
        }
        j=0;
            for (int i = 0; i <m; i++) {
                while(j<n*(i+1))
                {
                arr[(j)%n][i]=1;
                    j=(j+k+1);
                 }

        }
        for (int i = 0; i <arr.length; i++) {
            for ( j = 0; j <arr[i].length ; j++) {
                if (arr[i][j]==1)
                {
                    count++;
                }
            }
        }
       return count;
    }
}
