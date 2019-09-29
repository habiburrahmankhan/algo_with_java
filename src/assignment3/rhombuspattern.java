package assignment3;

import java.util.Scanner;

public class rhombuspattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        int n=s.nextInt();
        rhombus(n);
    }

    private static void rhombus(int n) {
        int i=n-1;
        while(i>=0)
        {
            int j=0;
            int space=0;
            while(space<i)
            {
                System.out.print(" ");
                space+=1;
            }
            while (j<n)
            {
               if (j==0 || j==n-1 || i==0 || i==n-1)
               {
                   System.out.print("*");
               }
               else
               {
                   System.out.print(" ");
               }

                j++;
            }
            System.out.println();
            i--;
        }

    }
}
