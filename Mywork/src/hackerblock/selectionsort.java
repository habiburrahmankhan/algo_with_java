package hackerblock;

import java.util.Scanner;

public class selectionsort {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=s.nextInt();
        }
        selectionSort(arr) ;
        for (int i = 0; i <n ; i++) {
            System.out.println(arr[i]);
        }

    }

    public  static  void selectionSort(int arr[])
    {
        for (int i = 0; i <arr.length-1 ; i++) {
            int min = minimum(i ,arr);
            swap(i,min,arr);
        }
    }
    public  static  int minimum(int i , int arr[])
    {
        int min=i ;
        for (int j = i+1; j < arr.length; j++) {
            if(arr[min] > arr[j])
            {
                min=j;
            }
        }
        return min;
    }
    public static  void swap(int i,int min ,int arr[])
    {
        int temp= arr[i] ;
        arr[i] = arr[min] ;
        arr[min] = temp ;
    }


}
