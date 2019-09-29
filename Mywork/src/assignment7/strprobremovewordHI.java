package assignment7;

import java.util.Scanner;

public class strprobremovewordHI {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        String str = s.next() ;
        System.out.println(counthi(str ,  "",0 ));
    }
    public static String counthi(String unprocessed,String processed ,int si )
    {
        int n=si ;
        si =unprocessed.indexOf("hi",si ) ;
        if (si==-1)
        {
            return processed ;
        }
        return  counthi(unprocessed , processed  +unprocessed.substring(n,si),si+2 )  ;
    }
}
