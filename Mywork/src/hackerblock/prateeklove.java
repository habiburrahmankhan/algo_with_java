package hackerblock;
import java.util.*;
public class prateeklove {
    public static void main(String args[]) {

        prateekLovesCandy();
    }

    public static void prateekLovesCandy() {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[] cases = new int[n];
        int max = 0;

        for (int i = 0; i < cases.length; i++) {

            cases[i] = scn.nextInt();
            max = Math.max(max, cases[i]);
        }

        ArrayList primes = getPrimes(max);

        for (int i = 0; i < cases.length; i++) {

            System.out.println(primes.get(cases[i] - 1));
        }
    }

    public static ArrayList getPrimes(int n) {

        boolean[] board = new boolean[1_000_001];

        board[0] = true;
        board[1] = true;

        for (int table = 2; table * table <= 1_000_000; table++) {

            if (!board[table])
                for (int mult = 2; table * mult <= 1_000_000; mult++) {
                    board[table * mult] = true;
                }
        }

        ArrayList ans = new ArrayList<>();

        int cnt = 0;
        for (int i = 2; cnt <= n; i++) {

            if (!board[i]){
                ans.add(i);
                cnt++;
            }
        }

        return ans;
    }

}