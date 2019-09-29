package assignment3;

import java.util.Scanner;

public class squarerootwithprecision {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        System.out.println("enter the  no  ");
        int n=s.nextInt() ;
        System.out.println("enter the precision ");
        int p = s.nextInt() ;
        System.out.println(sqrtprecision(n,p));
    }
    public static float sqrtprecision(int n,int p)
    {
        float sqrt =(float)Math.sqrt(n) ;

        return sqrt ;
    }
}
