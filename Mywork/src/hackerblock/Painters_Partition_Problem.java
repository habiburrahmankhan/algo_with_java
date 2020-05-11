package hackerblock;

import java.util.Arrays;
import java.util.Scanner;

public class Painters_Partition_Problem {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int k =s.nextInt();
        int n = s.nextInt();
        long arr[] = new long[n];
        for (int i = 0; i <arr.length ; i++) {
            arr[i] =s.nextLong();
        }
        System.out.println(mintime(arr , k));
    }

    private static long  mintime(long[] arr, int k) {
        Arrays.sort(arr);
        long start = 0 ;
        long end_time =0 ;
        long sum = 0 ;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        start = arr[arr.length -1 ];
        end_time = sum ;
        long final_ans =  0 ;
        while(start <= end_time )
        {
            long mid = (start + end_time ) /2 ;
            if(valid(arr , mid , k ))
            {
                final_ans = mid ;
                end_time = mid -1 ;
            }
            else
            {
                start = mid + 1 ;
            }

        }
        return  final_ans ;
    }

    private static boolean valid(long[] arr, long mid, int k) {
        int curpainter = 1  ;
         long curtime = 0 ;
        for (int i = 0; i <arr.length ; i++) {
            curtime+=arr[i];
            if (curtime>mid )
            {
                curpainter++;
                curtime = arr[i];
                if (curpainter  > k)
                {
                    return  false ;
                }
            }

        }



     return  true ;
    }


}
