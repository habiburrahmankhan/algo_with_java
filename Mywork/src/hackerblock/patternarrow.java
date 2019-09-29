package hackerblock;

import java.util.Scanner;

public class patternarrow {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        pattern(n);
    }
    public static void pattern(int n)
    {
        int i=0;
        int vmir=0 ;
        while(i<n)
        {
            int j=0;
            while(j<n)
            {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }


}
