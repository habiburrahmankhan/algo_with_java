package hackerblock;

import java.util.Scanner;

public class Strongest_Fighter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n  =s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=s.nextInt();
        }
        int k = s.nextInt();
        strongestfighter(arr,k);
    }
    public static void  strongestfighter(int arr[], int k )
    {
        for (int i = 0; i <arr.length-k+1; i++) {
            int max =0 ;
            for (int j= i; j <i+k ; j++) {
                if (max < arr[j])
                {
                    max = arr[j];
                }
            }
            System.out.print(max +  " ");
        }
    }
}
