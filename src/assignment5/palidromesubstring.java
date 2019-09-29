package assignment5;

import java.util.Scanner;

public class palidromesubstring {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        String pali =s.next() ;
     palidromesubstring(pali);
    }
    public static void palidromesubstring(String s)
    {
        String p ;
        int start=0;
        int end ;
        int count=0;
        for (int i = 0; i <s.length() ; i++) {
            for (int j =i; j<s.length() ; j++) {
               p=s.substring(i  ,j+1);
               start=0;
               end =p.length()-1;
               int c=0 ;
               while(start<=end)
               {
                   if(p.charAt(start)==p.charAt(end))
                   {
                       start++;
                       end--;
                   }
                   else
                   {
                       c=1 ;
                       break;
                   }
               }
               if(c==0)
               {
                   System.out.println(p);
               }
            }
        }
    }
}
