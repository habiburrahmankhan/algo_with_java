package hackerblock;

import java.util.Scanner;

public class String_pattern_Matching {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        String pattern = s.next();
        String str = s.next();
        patter_Match(str,pattern);
    }

    private static void patter_Match(String str, String pattern) {

        int loc = 0 , n = 0  , m ;
        while(true)
        {
            loc = str.indexOf(pattern , n);
            if (loc==-1)
            {
                break;
            }
            System.out.println( " Pattern is founnd at "+ loc);
            n = loc +1 ;
        }


    }
}
