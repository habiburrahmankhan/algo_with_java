package hackerblock;

import java.util.Scanner;

public class longestpalidromicsubstringDP {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        String str = s.next();
        System.out.println(longestPalindrome(str));
    }
    public static String longestPalindrome(String s) {
        boolean arr[][] = new boolean[s.length()][s.length()] ;
        int first = 0 ;
        int last = 0 ;
        if(s.length()==0)
        {
            return "";
        }
        for(int i = 0 ; i < s.length() ; i++)
        {
            arr[i][i] = true ;
        }
        for(int i =0 ; i < s.length() -1 ; i++)
        {
            if(s.charAt(i) == s.charAt(i+1))
            {
                arr[i][i+1] = true ;
                first = i ;
                last = i+1 ;
            }
        }
        for(int i = 2 ; i < s.length() ; i++ )
        {
            for(int j = 0 ; j < s.length() - i  ;j++)
            {
                int curr = i +  j;
                if(s.charAt(j) == s.charAt(curr) && arr[j+1][curr-1])
                {
                    arr[j][curr] = true ;
                    first = j ;
                    last = curr;
                }
            }
        }




        for(int i =0 ; i < s.length() ; i++)
        {
            for(int j =0 ; j < s.length() ; j++)
            {
                System.out.print(arr[i][j]   + "       ") ;
            }
            System.out.println() ;
        }
        return s.substring(first ,last +1 ) ;
    }
}
