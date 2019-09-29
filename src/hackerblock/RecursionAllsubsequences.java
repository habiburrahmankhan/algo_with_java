package hackerblock;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RecursionAllsubsequences {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;

            String str = s.next();
//           ArrayList<String> lexo  = subsequenceArray(str);
//            Collections.sort(lexo);
//            for (String st:
//                 lexo) {
//                System.out.println(st);
//            }

            subsequence("" , str);
    }


    public static void subsequence(String processed , String unprocessed )
    {
        if(unprocessed.isEmpty())
        {
            System.out.println(processed);
            return ;
        }
        char ch = unprocessed.charAt(0);
        unprocessed=unprocessed.substring(1);
        subsequence(processed,unprocessed);
        subsequence(processed+ch , unprocessed );

    }

    private static ArrayList<String> subsequenceArray(String str) {
       if (str.length()==0)
       {
           ArrayList<String> base = new ArrayList<>();
           base.add("");
           return base;
       }
        char ch=str.charAt(0);
        str=str.substring(1);
        ArrayList<String> mr = new ArrayList<>();
        ArrayList<String> rr = subsequenceArray(str) ;
        for (String rrs:
             rr) {
            mr.add(rrs);
            mr.add(ch + rrs);
        }

        return mr ;
    }
}
