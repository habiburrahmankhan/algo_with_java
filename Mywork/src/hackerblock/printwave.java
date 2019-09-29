package hackerblock;

import java.util.Scanner;

public class printwave {
    public static void main (String[]args){
        Scanner s = new Scanner(System.in);
        byte m = s.nextByte();
        byte n = s.nextByte();
        int ar[][] = new int[m][n];
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                ar[i][j] = s.nextInt();
            }
        }
        pattern(ar ,m ,n);
    }
    public static void pattern(int[][] ar ,int m ,int n)
    {
        int i=0;
        while(i<n)
        {
            int j;
            if(i%2==0)
            {
                j=0;
                while(j<m)
                {
                    System.out.print(ar[j][i] + ", ");
                    j++;
                }
            }
            else
            {
                j=m-1;
                while(j>0)
                {
                    System.out.print(ar[j][i] + ", ");
                    j--;
                }
            }
            i++;
        }
        System.out.print("END");

    }
    }
