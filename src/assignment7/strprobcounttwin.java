package assignment7;

import java.util.Scanner;

public class strprobcounttwin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        String str = s.next() ;
        int count =0 ;
        System.out.println(twincount(str,"",0));
    }
    public static int   twincount(String unprocessed,String processed , int count )
    {
        if (unprocessed.isEmpty())
        {
            return count ;
        }
        char ch=unprocessed.charAt(0);
        unprocessed=unprocessed.substring(1);
        if (unprocessed.length()==1) {
           return count ;
        }
        if (ch == unprocessed.charAt(1)) {
            count++;
        }
        return twincount(unprocessed,processed,count) ;
    }
}
