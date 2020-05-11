package hackerblock;

import java.util.Scanner;

public interface max_sum_kadene_algo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[]  = new int[n];
        for (int i =0 ; i < n ;i++)
        {
            arr[i] = s.nextInt();
        }
        int cs = 0 , ms = 0 ,left_  =0  ,  left = 0  , right = 0  ;
        for (int i = 0; i <n ; i++) {
            cs += arr[i] ;
            if (cs < 0 )
            {
                cs = 0 ;
                left = i + 1;

            }
            if (ms < cs )
            {
                left_ = left ;
                right =  i ;
            }

            ms = Math.max(cs , ms) ;
        }
        System.out.println("the maximum sub Arrayn " + ms);
        for (int i = left_; i <= right; i++) {
            System.out.print(arr[i ] +   "    ,    ");
        }
    }
}
