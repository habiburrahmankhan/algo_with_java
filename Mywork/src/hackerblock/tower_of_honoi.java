package hackerblock;

import java.util.Scanner;

public class tower_of_honoi {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        int n = s.nextInt() ;
        towerofhonai(n , 'A' , 'C' , 'B') ;
    }

    private static void towerofhonai(int n , char source , char destination , char helper ) {
     if (n==0)
     {
         return;
     }
     towerofhonai(n-1 , source ,  helper , destination );
        System.out.println("Move "  + n + " disk from " + source + " to " + destination );
        towerofhonai(n-1 , helper , destination , source );
    }
}
