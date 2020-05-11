package hackerblock;

import java.util.Scanner;

public class Palindromic_Queries {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n = s.nextInt();
        String str = s.next();
        int test = s.nextInt();
        for (int i = 0; i < test; i++) {
            int l = s.nextInt();
            int r = s.nextInt();
            if (palidrome(str , l ,r , n))
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }

    private static boolean palidrome(String str, int l, int r, int n) {
        int j = r-1 ;
        for (int i = l-1; i <r/2 ; i++) {
            if (str.charAt(i)!=str.charAt(j))
            {
                return false ;
            }
                j--;
        }



        return  true ;



    }
}
