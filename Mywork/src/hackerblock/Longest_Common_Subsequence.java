package hackerblock;

import lecture_19.MapAL;

import java.util.Scanner;

public class Longest_Common_Subsequence {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        String str1 = s.next();
        String str2 = s.next();
        int dp[][] = new int[str1.length()+1][str2.length()+ 1] ;
        StringBuilder st=new StringBuilder("") ;
     //   System.out.println(lcs(str1,str2 ,dp , st ));
        System.out.println(lcsprint(str1,str2,dp ,st));
        int dpr[][] = new int[str1.length()+1][str2.length()+ 1] ;
        for (int i = 0; i <dpr.length; i++) {
            for (int j = 0; j <dpr[i].length; j++) {
              dpr[i][j]=-1 ;
            }
        }
       // System.out.println(lcsrecursion(str1,str2,0 ,0,dpr));
    }


    private static  int lcs( String str1 , String str2  ,int dp[][] ,StringBuilder st )
    {
        int  m = str1.length();
        int n = str2.length();
        for (int i = 0; i <=m ; i++) {
            dp[0][i] = 0 ;
        }
        for (int i = 0; i <=n; i++) {
            dp[i][0] = 0 ;
        }

        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=m; j++) {
                if (str2.charAt(i-1)==str1.charAt(j-1))
                {
                    dp[i][j] = 1+ dp[i-1][j-1];
                }
                else
                {
                    dp[i][j]= Math.max(dp[i-1][j] , dp[i][j-1]) ;
                }
            }
        }


        for (int i = 0; i <=n; i++) {
            for (int j = 0; j <=m; j++) {
                System.out.print(  dp[i][j] + "   ");
            }
            System.out.println();
        }

        return  dp[n][m];
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






    private static int lcsrecursion(String str1 ,String str2 , int i ,int j ,int dpr[][] )
    {
        if (i==str1.length()|| j==str2.length())
        {
            return 0 ;
        }

        int res = 0 ;
        if (dpr[i][j]!=-1)
        {
            return dpr[i][j] ;
        }
        if (str1.charAt(i)==str2.charAt(j))
        {
            res = 1+ lcsrecursion(str1,str2,i+1,j+1 , dpr);
        }
        else
        {
            res =  Math.max(lcsrecursion(str1,str2,i+1,j ,dpr) ,lcsrecursion(str1,str2,i,j+1 ,dpr) ) ;
        }
        dpr[i][j] = res ;
        return  res;
    }
}


//AGGTAB GXTXAYB