package hackerblock;

import java.util.Scanner;

public class xorprofit {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
         a=Math.min(a,b);
         b =Math.max(a,b);
        int max =0;
        while(a<b)
        {
            int c=a^b ;
            if (c > max)
            {
                max=c;
            }
            a++;
        }

        System.out.println(max);
    }
}
