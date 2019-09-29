package assignment3;

import java.util.Scanner;

public class triplet {
    public static void main(String args[]) {
        Scanner s =new Scanner(System.in);

        int n=s.nextInt();
        int m = triplet(n);
        System.out.println((m+1) +  "   " + (m+2));
    }
    public static int triplet(int n)
    {
        if (Math.pow(n+2,2)== (Math.pow(n+1,2) + Math.pow(n,2)))
        {
            return n ;
        }
        return -1;
    }
}
