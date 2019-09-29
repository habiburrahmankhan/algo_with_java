package assignment7;

import java.util.Scanner;

public class strprobcountwordHI {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        String str = s.next() ;
        int count =0 ;
        System.out.println(counthi(str ,  0 , count));
    }
    public static int counthi(String unprocessed ,int si ,int count)
    {

        si =unprocessed.indexOf("hi",si ) ;
        if (si==-1)
        {
            return count ;
        }
        return  counthi(unprocessed ,si+1 , count+1)  ;


    }
}
