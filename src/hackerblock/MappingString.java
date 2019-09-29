package hackerblock;

import java.util.Scanner;

public class MappingString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        mapstring("" ,str) ;
    }

    private static void mapstring(String processed, String unprocessed) {

        if (unprocessed.length()==0)
        {
            System.out.println(processed);
            return;
        }

        if (unprocessed.length()>=2)
        {
             int   ch1  =unprocessed.charAt(0) -'0';
             int   ch2  =unprocessed.charAt(1) - '0';
             int   c= ch1*10 + ch2 ;

             mapstring(processed + (char)( ch1 +  'A' -1 ), unprocessed.substring(1));
             if (c<26) {
                 mapstring(processed + (char) (c + 'A' - 1), unprocessed = unprocessed.substring(2));//
             }

        }
        else
        {
            int ch1 = unprocessed.charAt(0) - '0';
            unprocessed=unprocessed.substring(1);
            mapstring(processed+ (char)(ch1 + 'A' -1) , unprocessed);
        }

    }
}
