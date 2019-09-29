package hackerblock;

import java.util.Scanner;

public class checkprime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        int number =s.nextInt() ;
            checkprime(number);
    }
    public static void checkprime(int number)
    {
        int n =number;
        boolean[] prime= new boolean[n+1] ;
        for (int i = 2; i <prime.length ; i++) {
            if (!prime[i])
            {
                for (int j = 2*i; j <prime.length ; j+=i) {
                       prime[j]=true;
                }
            }
        }

            if (!prime[number])
            {
                System.out.println("Prime");
            }
            else
            {
                System.out.println("Not Prime");
            }

    }
}
