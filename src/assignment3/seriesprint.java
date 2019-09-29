package assignment3;

import java.util.Scanner;

public class seriesprint {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter the first terms");
        int a=s.nextInt() ;
        System.out.println("not multiple of b ");
        int b=s.nextInt() ;
        series(a,b);

    }
    public static void series(int a ,int b)
    {
        int i=0 ,s =0 ;
        while (i<a)
        {
            s=3*i + 2 ;
            if(s%b!=0)
            {
                System.out.println(s);
            }
            i++ ;
        }
    }

}
