package lecture3.lecture4;

import java.util.Arrays;
import java.util.Scanner;

public class swaparray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        int arr[] = new int[5] ;
        System.out.println("enter the value in arrays :- ");
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = s.nextInt() ;
        }
        System.out.println("enter the value of i and j ");
        int i = s.nextInt() ;
        int j = s.nextInt() ;
        swap(arr ,i ,j) ;
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int arr[] ,int i ,int j)
    {
        int temp;
        temp=arr[i];
        arr[i]=arr[j] ;
        arr[j]=temp ;
    }
}
