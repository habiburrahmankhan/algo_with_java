package hackerblock;

import java.util.Scanner;

public class maximumcircularsubarray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        int test = s.nextInt();
        for (int i = 0; i <test ; i++) {
            int n = s.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j <arr.length ; j++) {
                arr[j]=s.nextInt();
            }
            circularsubarray(arr);
        }
    }
    public  static void  circularsubarray(int[] arr)
    {
        int front=0;
        int rare =arr.length-1 ;
        int  maximumsum =0 ;
        while(front<arr.length) {
            int i=0 ;
            int current_sum = 0 ;
            for (int k =0; k< arr.length ; k++) {
                current_sum += arr[(front + i) % arr.length];
                if (current_sum < 0) {
                    current_sum = 0;
                }
                maximumsum = Math.max(current_sum, maximumsum);

                i++;
            }
            front++;
        }
        System.out.println(maximumsum);
    }
}

// 1
// 7
// 8 -8 9 -9 10 -11 12