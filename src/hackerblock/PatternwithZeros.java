package hackerblock;

import java.util.Scanner;

public class PatternwithZeros {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        int n = s.nextInt() ;
        manmohan1(n) ;

    }
    public static void manmohan1(int n)
    {
        int i=1;
        while(i<=n)
        {
            int j=1;
            while(j<=i)
            {
                if (j==1 || j==i)
                {
                    System.out.print(i+ "\t");
                }
                else
                {
                    System.out.print("0" +  "\t");
                }
                j++;
            }

            System.out.println();
            i++;
        }
    }
}
