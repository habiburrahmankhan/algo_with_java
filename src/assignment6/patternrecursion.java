package assignment6;

import java.util.Scanner;

public class patternrecursion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        int n =s.nextInt();
        pattern1(n);
    }
    public static void  pattern1(int n)
    {
        if(n==0)
        {
            return ;
        }
        pattern1(n-1);
        int i=1;
        while(i<=n)
        {
            System.out.print("*");
            i++;
        }
        System.out.println();
    }
}
