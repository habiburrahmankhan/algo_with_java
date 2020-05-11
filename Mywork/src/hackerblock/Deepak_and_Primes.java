package hackerblock;

import java.util.Scanner;

public class Deepak_and_Primes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n  =s.nextInt();
        System.out.println(nth_prime(n));
    }

    private static long nth_prime(int n) {

        boolean[] prime= new boolean[86028121+10000000] ;
        for (int i = 2; i*i<=prime.length ; i++) {
            if (!prime[i])
            {
                for (int j = i*i; j<prime.length ; j+=i) {
                    prime[j]=true;
                }
            }
        }

        int count=0 ;
        long y=0 ;
        for (int i = 2;i<prime.length ; i++) {
            if (count >= n)
            {
                break;
            }
            if (!prime[i])
            {
                count++;
                y=i;
            }
        }

        return y ;
     }

}
//86,028,121