package hackerblock;

import java.util.Scanner;

public class STRINGSISPALINDROME {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        String str = s.next();
        System.out.println(palidrome(str));

    }
    public static Boolean palidrome(String str )
    {
        for (int i = 0; i <str.length()/2 ; i++) {
            if (str.charAt(i)!=str.charAt(str.length()-1-i))
            {
                return false;
            }
        }
        return true ;
    }
}
