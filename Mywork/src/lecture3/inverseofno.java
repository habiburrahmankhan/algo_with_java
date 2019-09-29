package lecture3;

import java.util.Scanner;

public class inverseofno {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        int n = s.nextInt() ;
        int place=1 ;
        double inverse=0;
        while(n>0)
        {
            int rem=n%10;
            inverse=inverse+place*Math.pow(10,rem-1) ;
            n/=10 ;
            place+=1;

        }
        System.out.println(inverse);
    }
}
