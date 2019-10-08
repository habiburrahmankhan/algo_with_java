package hackerblock;

import java.util.Scanner;

public class Tilling_Problem_II {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int test = s.nextInt();
        for (int i = 0; i < test; i++) {
            int n = s.nextInt();
            int m =s.nextInt();
            System.out.println(tilling(n,m));
        }
    }

    public static int tilling(int n, int m) {
            int count = ( n  + (n/m)*n);
            System.out.println(count);
              return  count%( (int )Math.pow(10 ,9)  + 7);
    }
}
