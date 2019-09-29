package assignment3;

import java.util.Scanner;

public class lcm {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        System.out.println("enter the first no  ");
        int a=s.nextInt() ;
        System.out.println("enter the second no ");
        int b = s.nextInt() ;
        System.out.println(lcm(a,b));
    }
    public static int lcm(int a,int b)
    {
        int lcm=0,max;

        if (a>b)
        {
            max=a ;
        }
        else
        {
            max=b ;
        }
        while (true){
            if(max%a==0 && max%b==0)
            {
                lcm=max ;
                break ;
            }
            max++ ;
        }
        return lcm ;
    }
}
