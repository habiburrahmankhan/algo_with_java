package hackerblock;

import java.util.Scanner;

public class modularexponential {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        System.out.println(fastexponent(a,b,c));

    }
    public static long  fastexponent(int a , int b, int c)
    {
        if (b==0)
        {
            return 1%c;

        }
        else if(b%2==0)
        {
            long d = fastexponent(a,b/2 , c);
            return (d*d)%c ;
        }
        else
        {
            return ((a%c)*fastexponent(a,b-1,c)%c) ;
        }

    }
}
