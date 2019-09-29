package assignment7;

import java.util.Scanner;

public class strprobcountwordHIbutnotHIT {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        String str = s.next() ;
        int count =0 ;
        System.out.println(counthi(str ,  0 , count));
    }
    public static int counthi(String unprocessed ,int si ,int count)
    {
        int n=si;
        si =unprocessed.indexOf("hi",si ) ;
        if (si==-1)
        {
            return count ;
        }
        if (si<unprocessed.length()-2) {
            if (unprocessed.charAt(si+2)!='t')
            {
                count++ ;
            }
        }
        if (si==unprocessed.length()-2)
        {
            count++ ;
        }
        return  counthi(unprocessed ,si+2, count)  ;


    }

}
