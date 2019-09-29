package assignment7;

import java.util.Scanner;

public class stringtointrec {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        String ss=s.next();
        System.out.println(integerconv(ss, 0,0));
    }
    public static int integerconv(String s ,int i,int digit)
    {
        if(i==s.length())
        {
            return digit ;
        }
        int n = s.charAt(i)-'0' ;
        digit=digit*10 + n ;
        return  integerconv(s,i+1,digit) ;
    }
}