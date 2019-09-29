package hackerblock;

import java.util.Scanner;

public class base17
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        String str  =s.next();
        base17(str) ;

    }
    public static void base17(String str)
    {
        int no =0;
        int place=1;
        for (int i = str.length()-1; i >=0 ; i--) {
            char ch =str.charAt(i);
            if (Character.isUpperCase(ch))
            {
                no+=place*(ch - 'A' +10);
                place*=17;
            }
            else
            {
                no+=place*(ch-'0');
                place*=17;
            }
        }
        System.out.println(no);
    }
}
