package assignment6;

import java.util.Scanner;

public class patternrec2 {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        pattern2(n);
    }

    public static void  pattern2(int n)
    {
        if(n==0)
        {
            return ;
        }
        int i=1;
        while(i<=n)
        {
            System.out.print("*");
            i++;
        }
        System.out.println();
        pattern2(n-1);

    }
}


