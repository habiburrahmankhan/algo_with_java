package hackerblock;

import java.util.Arrays;
import java.util.Scanner;

public class Ugly_Numbers {
    public static void main(String[] args) {
        Scanner s  =new Scanner(System.in);
        int test = s.nextInt();

        for (int i = 0; i <test ; i++) {
            int n  =s.nextInt();
            long dp[] = new long[10000] ;
            System.out.println(uglydp(n , dp));
        }
    }

    private static long uglydp(int n, long[] dp) {
        int i2=0 ,i3=0 ,i5 =0 ;
        dp[0]=1 ;
        long next2 = dp[i2]*2 ;
        long next3 = dp[i3]*3 ;
        long next5  = dp[i5]*5 ;
        for (int i = 1; i <=n ; i++) {
             long min = Math.min( next2, Math.min(next3 , next5));
            if (next2==min)
            {
                i2= i2 + 1 ;
                dp[i]=min ;
                next2=dp[i2]*2;

            }
            if(next3==min)
            {
                i3 = i3+1 ;
                dp[i]=min ;
                next3=dp[i3]*3;
            }
            if(next5==min)
            {
                i5= i5  + 1 ;
                dp[i]=min ;
                next5=dp[i5]*5;
            }

        }
        return dp[n-1];

    }
}
