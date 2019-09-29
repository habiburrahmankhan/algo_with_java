package hackerblock;

import java.util.Arrays;
import java.util.Scanner;

public class countingsort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=s.nextInt();
        }
        sortcounting(arr);
        for (int i = 0; i <n ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void sortcounting(int[] arr)
    {
        int max=arr[0] ;
        for (int i = 1; i < arr.length; i++) {
            if (max <arr[i])
            {
                max=arr[i];
            }
        }
        int freq[] = new int[max+1];
        for (int i = 0; i <arr.length ; i++) {
            freq[arr[i]]++;
        }
        max=0;
        for (int i = 0; i <freq.length; i++) {
            while(freq[i]>0)
            {
                arr[max]=i;
                freq[i]--;
                max++;
            }
        }
    }
}
