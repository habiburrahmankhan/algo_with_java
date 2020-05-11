package DP;

import java.util.Scanner;

public class longestCommonSubstringProblem {
    static  int[][] t = new int[1001][1001] ;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        String s1 = s.next();
        String s2 = s.next() ;
        int val = longestCommonSubstring(s1 , s2 ,s1.length() +1, s2.length()+1);
        System.out.println(val);
    }

    private static int longestCommonSubstring(String s1, String s2, int m, int n) {
            int ans = 0 ;

        for (int i = 0; i <m ; i++) {
            t[i][0] = 0 ;
        }
        for (int i = 0; i <n ; i++) {
            t[0][i] = 0 ;
        }
        for (int i = 1; i <m ; i++) {
            for (int j = 1; j <n ; j++) {
                if (s1.charAt(i-1)==s2.charAt(j-1))
                {
                    t[i][j] = 1 + t[i-1][j-1] ;
                    ans = Math.max(ans , t[i][j])  ;

                }
                else
                {
                    t[i][j] = 0;

                }
            }
        }
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                System.out.print(t[i][j] + "  ");
            }
            System.out.println();
        }

        return ans;
    }

}
