package assignment5;

import java.util.Scanner;

public class insertdifferenceascii {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        String pali =s.next() ;
        StringBuilder sb = new StringBuilder(pali) ;
             differenceascii(sb);
    }
    public static void differenceascii(StringBuilder s)
    {
       StringBuilder sb = new StringBuilder();
       sb.append(s.charAt(0)) ;
        for (int i = 0; i <s.length()-1 ; i++) {
            int a=s.charAt(i+1) -s.charAt(i) ;
            sb.append(a) ;
            sb.append(s.charAt(i+1));
        }
        System.out.println(sb.toString());
    }
}
