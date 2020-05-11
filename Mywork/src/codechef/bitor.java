package codechef;

import java.util.HashMap;
import java.util.Scanner;

public class bitor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int test  =s.nextInt();
        for (int i = 0 ; i<test;i++ )
        {
            long l  =s.nextLong();
            long r =s.nextLong();
            System.out.println(bit(l,r));
        }

    }

    public  static long msb(long N)
    {
        int msb = -1;
        while (N > 0)
        {
            N = N >> 1;
            msb++;
        }
        return msb;
    }
    private  static long bit(long L, long R)
    {
        long res = 0;


        long msbl =msb(L);
        long msbr =msb(R);

        while (msbl == msbr)
        {
            long res_val = (1 << msbl);
            res += res_val;

            L -= res_val;
            R -= res_val;

            msbl =msb(L);
            msbl = msb(R);
        }
        msbl = Math.max(msbl, msbr);
        for (long i = msbl; i >= 0; i--)
        {
            long res_val = (1 << i);
            res += res_val;
        }
        return res;
    }

}
