package DP;

import java.util.Arrays;
import java.util.Scanner;

public class longestCommonSubsequencePrintString {
    static  int[][] t = new int[1001][1001] ;
    public static void main(String[] args) {
        for (int i = 0; i <t.length ; i++) {
            Arrays.fill(t[i] , -1);
        }
        Scanner s = new Scanner(System.in) ;
        String s1 = s.next();
        String s2 = s.next() ;
        String val = longestCommonSubsequenceP(s1 , s2 ,s1.length() , s2.length());
        System.out.println(val);
    }

    private static String longestCommonSubsequenceP(String s1, String s2, int m, int n) {
        StringBuilder ans =new StringBuilder() ;
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                if (i==0 || j==0)
                {
                    t[i][j] = 0 ;
                }
                else if (s1.charAt(i-1)==s2.charAt(j-1))
                {
                    t[i][j] = 1 + t[i-1][j-1] ;
                }
                else
                {
                    t[i][j] = Math.max(t[i-1][j] , t[i][j-1]) ;
                }
            }


        }
        int i  = m , j = n ;
        while (i> 0 && j > 0)
        {
            if (s1.charAt(i-1) ==  s2.charAt(j-1))
            {
                ans.append(s1.charAt(i-1)) ;
                i-- ; j--;

            }
            else
            {
                if (t[i-1][j] > t[i][j-1])
                {
                    i--;
                }
                else
                {
                    j-- ;
                }
            }
        }
        return ans.reverse().toString() ;
    }
}
