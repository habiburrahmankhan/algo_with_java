package assignment7;

import java.util.Scanner;

public class duplicateprintstarbet {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in) ;
        System.out.println("enter the str1 ");
        String str1 = s.next() ;
        dupprint("",str1 );

    }

    public static void dupprint(String processed ,String unprocessed )
    {
        if(unprocessed.isEmpty())
        {
            System.out.println(processed);
            return ;
        }
        char ch = unprocessed.charAt(0);
        unprocessed=unprocessed.substring(1);
        if ( !(unprocessed.isEmpty()))
        {
            if (ch==unprocessed.charAt(0)) {
                dupprint(processed + ch + "*", unprocessed);
                return ;
            }
        }
        dupprint(processed+ch,unprocessed );

    }


}
