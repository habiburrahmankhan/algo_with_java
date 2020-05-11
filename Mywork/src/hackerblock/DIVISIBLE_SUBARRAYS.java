package hackerblock;

import java.util.Arrays;
import java.util.Scanner;

public class DIVISIBLE_SUBARRAYS {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int test = s.nextInt();
        for (int i = 0; i < test; i++) {
            int n = s.nextInt();
            long arr[] = new  long[1000005] ;
            for (int j = 0; j <n; j++) {
                arr[j] =s.nextInt();
            }
            System.out.println(subarray(arr ,n));
        }
    }

    public static long subarray(long arr[] ,int n)
    {
        long freq[] = new long[1000005];
        long sum=0 ;
        freq[0]=1;
        for (int i = 0; i <n; i++) {
            sum+=arr[i-1];
            sum =sum%n;
            sum=(sum+n)%n;
            freq[(int)sum]++;
        }
     //   System.out.println(Arrays.toString(arrsum));

     //   System.out.println(Arrays.toString(freq));
        long ans = 0 ;
        for (int i = 0; i <n ; i++) {
            ans +=(freq[i]*(freq[i] -1))/2;
        }
        return  ans;
    }
}
