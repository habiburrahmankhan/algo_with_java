package hackerblock;

import java.util.Scanner;

public class LCS_with_3_Strings {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        String str1 = s.next();
        String str2 = s.next();
        String str3 = s.next();
        int dp[][] = new int[str1.length()+1][str2.length()+ 1] ;
        StringBuilder st=new StringBuilder("") ;
        StringBuilder sttcommon = lcsprint(str1,str2,dp ,st);
        StringBuilder stt=new StringBuilder("") ;
        StringBuilder str4 = lcsprint(sttcommon.toString(),str3,dp ,stt);
        System.out.println(str4.length());
    }


    private static  StringBuilder lcsprint( String str1 , String str2  ,int dp[][] ,StringBuilder st )
    {
        int  m = str1.length();
        int n = str2.length();
        for (int i = 0; i <=m ; i++) {
            dp[i][0] = 0 ;
        }
        for (int i = 0; i <=n; i++) {
            dp[0][i] = 0 ;
        }
        for (int i = 1; i <=m; i++) {
            for (int j = 1; j <=n; j++) {
                if (str2.charAt(j-1)==str1.charAt(i-1))
                {
                    dp[i][j] = 1+ dp[i-1][j-1];
                }
                else
                {
                    dp[i][j]= Math.max(dp[i-1][j] , dp[i][j-1]) ;
                }
            }
        }
        for (int i = 0; i <=m; i++) {
            for (int j = 0; j <=n; j++) {
                System.out.print(  dp[i][j] + "   ");
            }
            System.out.println();
        }
        int i = m;
        int j = n;
        while(i>0 && j>0)
        {
            if (str1.charAt(i-1)==str2.charAt(j-1))
            {
                st.append(str1.charAt(i-1));
                i--;
                j--;

            }
            else if (dp[i-1][j] > dp[i][j-1])
            {
                i--;
            }
            else
            {
                j-- ;
            }

        }
        st.reverse();
        return  st;
    }
}
