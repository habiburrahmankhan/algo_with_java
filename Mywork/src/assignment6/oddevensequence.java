package assignment6;

import java.util.Scanner;

public class oddevensequence {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        int n =s.nextInt();
         increasedecrease(n);
    }
   public static void  increasedecrease(int n)
    {
        if (n==3)
        {
            return ;
        }
        System.out.println(2*n-7);
        increasedecrease(n-1);
        System.out.println(2*n-6);

    }

}
