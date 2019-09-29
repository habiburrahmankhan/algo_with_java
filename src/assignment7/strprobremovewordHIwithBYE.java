package assignment7;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;

public class strprobremovewordHIwithBYE {
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
            return processed+unprocessed.substring(n) ;
        }

        return  counthi(unprocessed , processed  +unprocessed.substring(n,si)+"bye",si+2 )  ;


    }

    //sir soln

//   public static String count(String processed ,String unprocessed)
//    {
//    if(unprocessed.length()<2)
//    {
//        return processed+ unprocessed;
//    }
//    char ch =unprocessed.charAt(0);

//    if (ch=='p' &&unprocessed.charAt(1)=='i')
//    {
//        return count(processed+"3.14" ,unprocessed.substring(2)) ;
//    }
//    else
//    {
//        return count(processed+ch , unprocessed.substring(1)) ;
//    }
//
//    }

}