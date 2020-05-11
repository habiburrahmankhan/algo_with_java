package hackerblock;

import java.util.Scanner;

public class Winning_CB_Scholarship {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int x = s.nextInt();
        int y = s.nextInt();
        System.out.println(cbwinning(n, m, x, y));
    }

    private static int cbwinning(int n, int m, int x, int y) {
        int start = 0;
        int end = n;

        int final_ans = 0;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (valid(mid,n, m, x, y)) {
                final_ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }


        }

        return final_ans;
    }

    private static boolean valid(int mid, int n, int m, int x, int y) {
       return mid*x<=(m + (n-mid)*y ) ;
    }
}