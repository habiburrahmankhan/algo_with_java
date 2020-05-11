package DP;

import java.util.Scanner;

public class longestCommonSuperSequence {
    static int[][] t = new int[1001][1001];

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.next();
        String s2 = s.next();
        int val = longestCommonSubsequenceTD(s1, s2, s1.length() + 1, s2.length() + 1);
        int ans = s1.length() + s2.length() - val ;
        System.out.println(ans);
    }
    private static int longestCommonSubsequenceTD(String s1, String s2, int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    t[i][j] = 0;
                } else if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    t[i][j] = 1 + t[i - 1][j - 1];
                } else {
                    t[i][j] = Math.max(t[i - 1][j], t[i][j - 1]);
                }
            }

        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(t[i][j] + "   ");
            }
            System.out.println();
        }


        int i  = s1.length() , j = s2.length() ;
        StringBuilder ans = new StringBuilder();
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
                    ans.append(s1.charAt(i-1));
                    i--;
                }
                else
                {
                    ans.append(s2.charAt(j-1)) ;
                    j-- ;
                }
            }
        }
        while(i > 0)
        {
            ans.append(s1.charAt(i-1));
            i-- ;
        }
        while (j>0)
        {
            ans.append(s2.charAt(j-1));
            j-- ;
        }
        System.out.println("Shorest SuperSequence   "   + ans.reverse().toString());
        return t[s1.length()][s2.length()];
    }

}
//Output: "AGXGTXAYB" OR "AGGXTXAYB"