package assignment7;

import java.util.Scanner;

public class checkpalidromestring {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in) ;
        System.out.println("enter the str1 ");
        String str1 = s.next() ;

        System.out.println(checkreverse(str1 )) ;
    }
    public static boolean checkreverse(String str1 )
    {
        for (int i = 0; i <str1.length() ; i++) {
            if (str1.charAt(i)!=str1.charAt(str1.length()-i-1))
            {
                return false ;
            }
        }
        return true ;
    }
}
