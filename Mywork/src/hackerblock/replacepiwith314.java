package hackerblock;

import java.awt.desktop.ScreenSleepEvent;
import java.util.Scanner;

public class replacepiwith314 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int test=s.nextInt();
        for (int i = 0; i <test ; i++) {
            String str = s.next();
            replacepi(str);
        }
    }
    public static void replacepi(String str)
    {

        while(true)
        {
            int n =str.indexOf("pi" , 0);
            if (n==-1)
            {
                break;
            }
            str=str.substring(0,n)+ "3.14" + str.substring(n+2);
        }
        System.out.println(str);
    }
}
