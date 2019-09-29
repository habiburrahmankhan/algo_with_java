package assignment5;

import java.util.Scanner;

public class palidromestring {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        String pali =s.next() ;
        System.out.println(palidrome(pali));
    }
    public static boolean palidrome(String s)
    {
        int start =0;
        int end = s.length() -1 ;
        for (int i = start; i <end ; i++) {
            if(s.charAt(i) != s.charAt(end))
            {
                return  false ;
            }
           end--;
        }
        return true ;
    }
}
