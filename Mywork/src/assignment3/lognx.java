package assignment3;

import java.util.Scanner;

public class lognx {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        System.out.println("enter the n(base) no    (logn x) ");
        int n=s.nextInt() ;
        System.out.println("enter the x   no (logn x)");
        int x = s.nextInt() ;
        System.out.println(log(x,n));
    }
    public static float log(int x,int n)
    {
        float log= (float)(Math.log(x) / Math.log(n) ) ;


        return log ;
    }
}
