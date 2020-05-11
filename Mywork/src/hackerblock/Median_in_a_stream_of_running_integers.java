package hackerblock;

import java.util.Arrays;
import java.util.Scanner;

public class Median_in_a_stream_of_running_integers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int test =s.nextInt();
        for (int i = 0; i < test; i++) {
            int n = s.nextInt();
            int arr[] = new int[n];
            for (int j = 0; j <arr.length ; j++) {
                arr[j]=s.nextInt() ;
            }
            median(arr);
        }
    }

    private static void median(int[] arr) {

        for (int i = 0; i <arr.length ; i++) {
                findmedian(arr,0 , i+1);

        }


    }

    private static void findmedian(int arr[],int start, int end) {
        if (end==1)
        {
           System.out.print(arr[start] + " ");
            return;
        }
        Arrays.sort(arr , start , end);
        int median=0 ;
        if (end%2==0)
        {
             median = (arr[end/2-1] + arr[(end/2)])/2;
        }
        else
        {
             median = arr[end/2];
        }
        System.out.print(median + " ");
       // System.out.println( start + "    " + end + "    "  + Arrays.toString(arr));
    }
}
