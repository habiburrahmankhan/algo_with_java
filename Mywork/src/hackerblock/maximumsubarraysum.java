package hackerblock;

import java.util.Scanner;

public class maximumsubarraysum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        int test = s.nextInt();
        for (int i = 0; i < test; i++) {
            int n = s.nextInt() ;
            int[] arr =new int[n];
            for (int j = 0; j <arr.length ; j++) {
                arr[j]=s.nextInt();
            }
           // maxsubarray(arr);
            maxsubarray2(arr );
        }

    }
    public static void maxsubarray(int arr[])
    {
        int current_sum  , maximumsum=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                current_sum = 0 ;
                for (int k = i; k <=j ; k++) {
                    current_sum+=arr[k] ;
                }
                if (current_sum > maximumsum)
                {
                    maximumsum=current_sum ;
                }
            }
        }
        System.out.println(maximumsum);
    }
    public static void maxsubarray2(int arr[] )
    {
        int current_sum=0  , maximumsum=0;
        for (int i = 0; i <arr.length ; i++) {
           current_sum+=arr[i] ;
           if (current_sum < 0)
           {
               current_sum=0;
           }
           maximumsum=Math.max(current_sum , maximumsum) ;
        }

        System.out.println(maximumsum);
    }

}
