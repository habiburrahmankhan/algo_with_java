package hackerblock;

import java.util.Scanner;

public class Book_Allocation_Problem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int test  = s.nextInt();
        for (int j = 0; j <test ; j++) {
            int n  =s.nextInt();
            int k = s.nextInt();
            int arr[] = new int[n];
            long sum=0;
            for (int i = 0; i <arr.length ; i++) {
                arr[i] = s.nextInt();
            }
            System.out.println(bookallocation( arr , k ));
        }


    }
    public static  long bookallocation(int arr[]  , int k )
    {
        long start  = 0;
        long end = 0  ;
        long sum = 0 ;
        for (int i = 0; i <arr.length; i++) {
            sum+=arr[i];
            //start=Math.max(start , arr[i]);
        }
        start =arr[arr.length -1 ];
        end = sum ;
        long fnal_ans = start ;
        while(start<=end)
        {
            long mid = (start + end )/2 ;
            if(validcon(arr , arr.length , k , mid))
            {
                
                fnal_ans =mid ;
                end=mid -1 ;
            }
            else
            {
                start = mid +1 ;
            }
        }

        return  fnal_ans;
    }

    private static boolean validcon(int[] arr, int length, int k, long mid) {
        int student = 1;
        int curpages = 0 ;

        for (int i = 0; i < length; i++) {
            if ((curpages + arr[i]) > mid)
            {
                curpages =arr[i];
                student++;
                if (student > k )
                {
                    return  false ;
                }
            }
            else
            {
                curpages+=arr[i];
            }
        }


        return  true ;


    }
}
