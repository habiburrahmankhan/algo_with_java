package assignment7;

import java.util.Scanner;


public class strprobremovewordHIbutnotHIT {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        String str = s.next() ;

       counthi(str ,  0 , "");
    }
    public static void counthi(String unprocessed ,int si ,String processed)
    {
        int n=si;
        si =unprocessed.indexOf("hi",si ) ;
        if (si==-1)
        {
            System.out.println(processed+unprocessed.substring(n,unprocessed.length()-1));
            return  ;
        }
        if (si<unprocessed.length()-2) {
            if (unprocessed.charAt(si+2)!='t')
            {
                processed=processed + unprocessed.substring(n,si);
            }
            else
            {
                processed=processed + unprocessed.substring(n,si+3);
            }
        }
        if (si==unprocessed.length()-2)
        {
            processed=processed + unprocessed.substring(n,si);
        }
         counthi(unprocessed ,si+2 , processed)  ;

    }

}
