package assignment7;

import java.util.Scanner;


public class strprobcontentbetbraket {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        String str = s.next() ;
        System.out.println(counthi(str ,  "",0 ));
    }
    public static String counthi(String unprocessed,String processed ,int si )
    {

        si =unprocessed.indexOf("(",si ) ;
       int n =unprocessed.indexOf(")",si+1 ) ;
        if (si==-1)
        {
            return processed ;
        }
        return  counthi(unprocessed , processed  +unprocessed.substring(si+1,n),si+1)  ;


    }
}
