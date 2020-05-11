package hackerblock;

import java.util.Scanner;

public class Pythagoras_Triplet {
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        long n  =s.nextInt();
        triplet(n);
    }

    private static void triplet(long n) {
        if (n==1 || n==2)
        {
            System.out.println("-1");
            return;
        }
        if(n%2==0)
        {
            long m = n*n/4;
            System.out.print((m-1) + " " + (m+1));
        }
        else
        {
            long m=((n+1)*(n-1)/2);
            long p =(((n+1)*(n+1)/4) + ((n-1)*(n-1)/4));
            System.out.println(m + " " + p);
        }

    }
}
