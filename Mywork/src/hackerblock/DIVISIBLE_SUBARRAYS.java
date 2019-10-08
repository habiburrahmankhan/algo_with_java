package hackerblock;

import java.util.Arrays;
import java.util.Scanner;

public class DIVISIBLE_SUBARRAYS {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int test = s.nextInt();
        for (int i = 0; i < test; i++) {
            int n = s.nextInt();
            int arr[] = new  int[n] ;
            for (int j = 0; j <arr.length ; j++) {
                arr[j] =s.nextInt();
            }
            System.out.println(subarray(arr));
        }
    }

    public static int subarray(int arr[] )
    {
        int arrsum[] = new int[arr.length];
        int count=0 ,sum=0 ;
        for (int i = 0; i <arr.length ; i++) {
              sum+=arr[i];
              arrsum[i]= sum ;
            }
       // System.out.println(Arrays.toString(arrsum));
        for (int i = arr.length -1; i >=0 ; i--) {
            for (int j = i-1; j>=0 ; j--) {
                if ((arrsum[i] - arrsum[j])%arr.length ==0)
                {
                    count++ ;
                }
            }
            if (arrsum[i]%arr.length==0)
            {
                count++;
            }

        }
        return count ;
    }
}
