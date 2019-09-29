package hackerblock;

import java.util.Scanner;

public class starno {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        int n=s.nextInt();
        star(n);
    }
    public static void star(int n)
    {
        int i=1;
        while(i<=n)
        {
            int j=1;
            while (j<=n)
            {
                if (i>=j)
                {
                    System.out.print(j);
                }
                else
                {
                    System.out.print("*");
                }

                j++;
            }
            System.out.println();
            i++;
        }
    }
}
