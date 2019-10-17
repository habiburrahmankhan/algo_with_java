package hackerblock;

import java.util.Arrays;
import java.util.Scanner;

public class Class_Assignment {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int test=s.nextInt();
        for (int i = 0; i < test; i++) {
            int digit = s.nextInt() ;

            System.out.println(no_of_digit(digit ,""));

        }
    }

    private static int no_of_digit(int digit ,String str) {

        if (str.length()>1)
        {
            if (str.charAt(str.length()-1)=='1' && str.charAt(str.length()-2)=='1')
            {
                return 0 ;
            }
        }
        if (digit==0)
        {
          //  System.out.println(str);
            return 1 ;
        }
        int count_l = 0 , count_r = 0 ;

               count_l+=no_of_digit(digit -1 , str + '0' );
               count_r += no_of_digit(digit - 1, str + '1');


        return count_l + count_r ;
    }
}
