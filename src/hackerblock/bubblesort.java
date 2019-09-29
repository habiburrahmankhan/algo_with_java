package hackerblock;

import java.util.Scanner;

public class bubblesort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=s.nextInt();
        }
        bublesort(arr); ;
        for (int i = 0; i <n ; i++) {
            System.out.println(arr[i]);
        }

    }
    public static void bublesort(int arr[])
    {
        int temp ;
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j <arr.length  -1-i ; j++) {
                if(arr[j] > arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1] ;
                    arr[j+1] = temp ;
                }
            }
        }
    }
}
