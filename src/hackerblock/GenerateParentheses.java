package hackerblock;

import java.util.Scanner;

public class GenerateParentheses {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        parenthese(1,0,n,"(");
    }
    public static void parenthese(int ob ,int cb ,int n , String ans)
    {
        if (cb==n && ob==n) {
            System.out.println(ans);
            return;
        }
        if (cb>ob)
        {
            return;
        }
          if (ob<=n) {
              parenthese(ob + 1, cb, n, ans + " ( ");
          }
          if (cb<=n) {
              parenthese(ob, cb + 1, n, ans + " ) ");
          }



    }
}
