package hackerblock;

import java.util.Scanner;

public class manmohanpattern2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        int n = s.nextInt() ;
        manmohan2(n) ;

    }
    public static void manmohan2(int n)
    {
        int i=1;
        while(i<=n)
        {
            int j=1;
            while(j<=i)
            {
                if (i==1)
                {
                    System.out.print("1");
                }
                else if ( j==1 || j==i)
                {
                    System.out.print(i-1);
                }
                else
                {
                    System.out.print("0");
                }

                j++;
            }

            System.out.println();
            i++;
        }
    }
}
