package assignment6;

import java.awt.desktop.ScreenSleepEvent;
import java.util.Scanner;

public class pascaltriangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        int n = s.nextInt() ;
        pattern3(n-1);
    }
    public static int fact(int n)
    {
        if (n==0)
        {
            return 1;
        }
        return n*fact(n-1) ;
    }
    public static void pattern3(int n)
    {
        if (n==0)
        {
            int p=fact(n) / ( fact(n-n)*fact(n) );
            System.out.println(p + " ");
            return ;
        }
        pattern3(n-1);
        int i=0;

        while(i<=n)
        {
            int p=fact(n) / ( fact(n-i)*fact(i) );
            System.out.print(p + " ");
            i++;
        }
        System.out.println();


    }
}
