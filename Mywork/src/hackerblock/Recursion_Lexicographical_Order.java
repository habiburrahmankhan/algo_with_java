package hackerblock;

import java.util.Scanner;

public class Recursion_Lexicographical_Order {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        lexoorderno( n , 0);
    }

    private static void lexoorderno(int target, int present) {
       if (present > target)
       {
           return;
       }
        System.out.print(present + " ");
        for (int i =0; i <10; i++) {
            if (present==0&&i==0)
            {
                continue;
            }
             lexoorderno(target,present*10+i);

        }
    }

}
