package assignment5;

import java.util.Scanner;

public class togglechar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        String a =s.next() ;
        StringBuilder sb = new StringBuilder(a) ;
        System.out.println(togglechar(sb) ) ;
    }
    public static StringBuilder togglechar(StringBuilder s)
    {
        for (int i = 0; i <s.length() ; i++) {
            char ch =s.charAt(i) ;
            if (ch>='A' && ch<='Z' )
            {
                ch=(char)(ch+32);

            }
            else if(ch>='a' && ch<='z')
            {
                ch=(char)(ch-32);
            }

            s.setCharAt(i,ch);
        }
        return s ;
    }
}
