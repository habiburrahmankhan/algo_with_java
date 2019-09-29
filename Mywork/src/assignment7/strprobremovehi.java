package assignment7;

import java.util.Scanner;

public class strprobremovehi {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        String str = s.next() ;

      // System.out.println(count( "" ,str));
        counthi(str ,  0 , "");
    }


    public static void counthi(String unprocessed ,int si ,String processed)
    {
        int n=si;

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


//    public static String count(String processed ,String unprocessed)
//    {
//    if(unprocessed.length()<2)
//    {
//        return processed+unprocessed;
//    }
//    char ch =unprocessed.charAt(0);
//
//    if (ch=='h' &&unprocessed.charAt(1)=='i') {
//        if (unprocessed.length()>2)
//        {
//            if (unprocessed.charAt(2) == 't') {
//                return count(processed + unprocessed.substring(0, 3), unprocessed.substring(3));
//            }
//            else
//                {
//                return count(processed, unprocessed.substring(2));
//            }
//        }
//        else
//        {
//            return count(processed, unprocessed.substring(2));
//        }
//
//    }
//
//
//        return count(processed+ch , unprocessed.substring(1)) ;
//
//    }
}
