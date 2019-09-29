package hackerblock;

import java.util.Scanner;

public class pascaltriangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        int n = s.nextInt() ;
        pascal(n);
    }
    public  static  void pascal(int n)
    {

        int p=n ;

        for (int j = 0; j <n ; j++) {
            int i=0;
            while(i<p)
            {
                System.out.print(" ");
                i++ ;
            }
            p--;
            for (int k = 0; k <=j; k++) {
                int pascal = (fact(j)/(fact(k)*fact(j-k)));
                System.out.print(pascal+ " ");
            }
            System.out.println();
        }

    }
    public  static  int fact(int i)
    {
        if (i<2)
        {
            return 1 ;
        }

        return i*fact(i-1);
    }
}
