package hackerblock;

import java.util.Scanner;

public class stringdiffascii {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String str = s.next();
        diffascii(str);
    }
    public  static  void diffascii(String str)
    {
        StringBuilder sb = new StringBuilder() ;
        sb.append(str.charAt(0));

        for (int i = 0; i <str.length()-1 ; i++) {
            char ch1 =str.charAt(i);
            char ch2 = str.charAt(i+1);
            int ch = ch2 - ch1 ;
            sb.append(ch);
            sb.append(ch2);
        }
        System.out.println(sb);
    }
}
