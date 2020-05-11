package hackerblock;

import java.util.Scanner;

public class CountNumberofBinaryStrings {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        int test = s.nextInt();
        for (int i = 0; i <test ; i++) {
            int n = s.nextInt();
            int count = countnumber(n );
            System.out.println(count);
        }
    }
    public static int countnumber(int n) {
        int a[] = new int[n];
        int b[] = new int[n];

        a[0] = 1;
        b[0] = 1;

        for (int i = 1; i < n; i++) {
            a[i] = a[i - 1] + b[i - 1];
            b[i] = a[i - 1];
        }

        return a[n - 1] + b[n - 1];
    }
}
