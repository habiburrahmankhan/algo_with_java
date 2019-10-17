package hackerblock;

import java.util.Scanner;

public class Fibonacci_Pattern_ {
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        int n  =s.nextInt();
        fibo( n);
    }
    private  static void fibo(int n)
    {
        int i = 0 ,a=1 ,b=1 ,c;
        while (i<n)
        {
            int j = 0 ;
            while (j<=i)
            {
                if (i==1 || i==0)
                {
                    System.out.print(i + " ");
                }
                else
                    {
                     c = a + b;
                        System.out.print(c + " ");
                    a = b;
                    b = c;

                }
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
