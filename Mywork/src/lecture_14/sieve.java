package lecture_14;

import java.util.Scanner;

public class sieve {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        boolean[] prime= new boolean[n+1] ;
        for (int i = 2; i <prime.length ; i++) {
            if (!prime[i])
            {
                for (int j = 2*i; j <prime.length ; j+=i) {
                    prime[j]=true;
                }
            }
        }
        for (int i = 2; i <prime.length ; i++) {
            if (!prime[i])
            {
                System.out.println(i);
            }
        }
    }
}
