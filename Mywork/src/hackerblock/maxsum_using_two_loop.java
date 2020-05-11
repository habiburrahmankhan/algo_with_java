package hackerblock;

import java.util.Arrays;
import java.util.Scanner;

public class maxsum_using_two_loop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt() ;
        int arr[] = new int[n] ;
        int cumSum[] = new int[n+1];
          cumSum[0] =  0 ;
        for (int i = 0; i <n ; i++) {
             arr[i] = s.nextInt();
             cumSum[i+1] = cumSum[i] + arr[i] ;
        }
        System.out.println(Arrays.toString(cumSum));
         int curSum = 0  , max = 0 , left =0 , right = 0;
        for (int i = 0; i <=n ; i++) {
            for (int j = i+1; j<=n ; j++) {

                curSum = 0;
                curSum = cumSum[j] - cumSum[i] ;
                if (max < curSum)
                {
                    max = curSum ;
                    left = i;
                    right = j;
                }
            }
        }
      //  System.out.print( left + "  ,    " + right);
        for (int i = left; i <right ; i++) {
            System.out.print(arr[i] + "  ,    ");
        }
        System.out.println(" max sum " + max);

    }

}
