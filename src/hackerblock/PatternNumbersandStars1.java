package hackerblock;

import java.util.Scanner;

public class PatternNumbersandStars1 {
    public static void main(String[] args) {
        Scanner s = new Scanner( System.in);
        int n = s.nextInt();
        starpattern(n);
    }
    public  static void starpattern(int n)
    {
        int i=0;
        int p=n;
        while(i<n)
        {
            for (int j = 1; j <=p; j++) {
                System.out.print(j+ " ");
            }
            p--;


            int j=0;
            while(j<2*i-1)
            {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++ ;
        }
    }
}
