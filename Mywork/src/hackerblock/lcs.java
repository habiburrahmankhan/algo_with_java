package hackerblock;

import java.util.Scanner;

public class lcs {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        String str1 = s.next();
        String str2 = s.next() ;
        System.out.println(lcs(str1 , str2));
        System.out.println(lcsdp(str1 , str2));
    }

    private static int lcsdp(String str1, String str2) {
      int mat [][]  = new int[str1.length()+1][str2.length()+1] ;
        for (int i = str1.length() -1 ; i >=0 ; i--) {
            for (int j = str2.length() - 1; j >=0 ; j--) {
                if (str1.charAt(j)==str2.charAt(i))
                {
                    mat[i][j] = 1 + mat[i+1][j+1] ;
                }
                else
                {
                    mat[i][j] = Math.max(mat[i+1][j] , mat[i][j+1]) ;
                }
            }
        }
        return  mat[0][0] ;
    }

    public static int lcs(String str1 , String str2 )
    {
        int count =0 ;
        if(str1.length()==0 || str2.length()==0)
        {
            return  0 ;
        }
        if (str1.charAt(0)==str2.charAt(0))
        {
            return 1 + lcs(str1.substring(1) , str2.substring(1)) ;
        }
        else
        {
            return  Math.max(lcs(str1.substring(1) , str2) , lcs(str1 , str2.substring(1))) ;
        }
    }


}
