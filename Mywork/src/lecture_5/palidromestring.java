package lecture_5;

import java.util.Scanner;

public class palidromestring {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        String a=s.next() ;
        System.out.println(palidrome(a));
    }
    public static boolean palidrome(String s)
    {
        int start = 0 ;
        int end = s.length()-1;
        while(start<=end)
        {
            if(s.charAt(start)==s.charAt(end))
            {
                end--;
                start++;
            }
            else
            {
                return false;
            }

        }
       return true ;
    }
}
