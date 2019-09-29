package assignment7;

import java.util.Scanner;

public class sumofdigitrec {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        String ss=s.next();
        System.out.println(sumdigit(ss, 0,0));
    }
    public static int  sumdigit(String s ,int i,int sum)
    {
        if(i==s.length())
        {
            return sum ;
        }
        sum+=s.charAt(i)-'0' ;
        return sumdigit(s,i+1,sum) ;
    }
}
