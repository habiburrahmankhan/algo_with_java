package hackerblock;

import java.util.Scanner;

public class insertionsort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=s.nextInt();
        }
        InsertionSort(arr) ;
        for (int i = 0; i <n ; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void InsertionSort(int[] arr)
    {
        for (int i = 1; i <arr.length ; i++) {
            int val = arr[i] ;
            int j=i-1;
            while(j>=0 && arr[j]>val)
            {
                arr[j+1]=arr[j] ;
                j--;
            }
            arr[j+1]=val ;
        }
    }
}
