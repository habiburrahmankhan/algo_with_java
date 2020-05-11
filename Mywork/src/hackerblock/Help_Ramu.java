package hackerblock;

import java.util.Map;
import java.util.Scanner;

public class Help_Ramu {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int test =s.nextInt();
        for (int i = 0; i <test; i++) {
            int c1  = s.nextInt();
            int c2  = s.nextInt();
            int c3  = s.nextInt();
            int c4  = s.nextInt();
            int n = s.nextInt();
            int m = s.nextInt();
            int rickshaw[] = new int[n];
            int cab[] = new int[m];
            for (int j = 0; j <rickshaw.length; j++) {
                rickshaw[j] = s.nextInt();
            }
            for (int j = 0; j <cab.length ; j++) {
                cab[j] = s.nextInt();
            }
            int cab_cost = 0 , rickshaw_cost = 0 ;
            for (int j = 0; j <rickshaw.length; j++) {
                rickshaw_cost+=Math.min(c1*rickshaw[j] , c2);
            }
            rickshaw_cost= Math.min(rickshaw_cost , c3);
            for (int j = 0; j <cab.length; j++) {
                cab_cost+=Math.min(c1*cab[j] , c2);
            }
            cab_cost= Math.min(cab_cost , c3);
            int final_ans = Math.min(c4 , cab_cost + rickshaw_cost);
            System.out.println(final_ans);
        }
    }
}
