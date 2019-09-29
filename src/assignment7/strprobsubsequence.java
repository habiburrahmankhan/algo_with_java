package assignment7;

import java.util.Scanner;

public class strprobsubsequence {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        String str = s.next() ;
       int  strno[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26} ;
    }
    public static void strsubsequence(String unprocessed ,String strno)
    {

    }
    public static void subsequence(String processed , String unprocessed )
    {
        if(unprocessed.isEmpty())
        {
            System.out.println(processed);
            return ;
        }
        char ch = unprocessed.charAt(0);
        unprocessed=unprocessed.substring(1);
        subsequence(processed+ch , unprocessed );
        subsequence(processed,unprocessed);
    }
}
