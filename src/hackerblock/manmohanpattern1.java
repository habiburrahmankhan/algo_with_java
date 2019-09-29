package hackerblock;

import java.util.Scanner;

public class manmohanpattern1 {
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
                    System.out.print("1");
                }
                else if (i>2 && i%2!=0)
                {
                    System.out.print("1");
                }
                else if(i>2 && i%2==0)
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
