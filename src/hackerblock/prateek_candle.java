package hackerblock;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class prateek_candle {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        ArrayList<Integer> primearray = new ArrayList<>(1000000);
        int max=0;
        int[] arrayscase=new int[n];
        for (int i = 0; i <n ; i++) {
            arrayscase[i]=s.nextInt();
            max=Math.max(max ,arrayscase[i]);
        }
        checkprime(primearray ,max);
        for (int j = 0; j < n; j++) {
            System.out.println(primearray.get(arrayscase[j]-1));
        }
        System.out.println(primearray.size());
    }





        public static  void checkprime(ArrayList<Integer> primearray ,int max)
        {

            int k=0;
            boolean[] prime = new boolean[10000000+1];
            for (int j = 2; j*j<=prime.length && k<max; j++) {
                if (!prime[j]) {
                    for (int l = 2; l*j<=prime.length; l++) {
                        prime[l*j]=true;
                    }
                }
                if (!prime[j])
                {
                    primearray.add(j);
                    k++;
                }
            }
        }



}