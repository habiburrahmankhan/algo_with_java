package DP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class longestCommonSubsequenceRecursively {
    static  int[][] t = new int[1001][1001] ;
    public static void main(String[] args) {
        for (int i = 0; i <t.length ; i++) {
            Arrays.fill(t[i] , -1);
        }
        Scanner s = new Scanner(System.in) ;
        String s1 = s.next();
        String s2 = s.next() ;
        int val = longestCommonSubsequence(s1 , s2 ,s1.length() , s2.length());
        System.out.println(val);
    }

    private static int longestCommonSubsequence(String s1, String s2, int m, int n) {
    if (m==0 || n==0)
    {
        return  0 ;
    }
    if (t[m][n]!= -1)
    {
        return t[m][n] ;
    }
    if (s1.charAt(m-1)==s2.charAt(n-1))
    {
        return t[m][n] = 1 + longestCommonSubsequence(s1 ,s2 ,m-1 , n-1);
    }
    else
    {
        return t[m][n] = Math.max(longestCommonSubsequence(s1 ,s2 ,m-1 , n ) , longestCommonSubsequence(s1 , s2 , m , n-1));
    }

    }
}
