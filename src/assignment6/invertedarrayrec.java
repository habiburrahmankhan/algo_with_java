package assignment6;

import java.util.Arrays;
import java.util.Scanner;

public class invertedarrayrec {
    public static void main(String[] args) {
        int arr[] = new int[5] ;
        int inarr[] = new int[5] ;
        Scanner s = new Scanner(System.in) ;

        for (int i = 0; i < arr.length ; i++) {
            System.out.println("enter the value in array ");
            arr[i] = s.nextInt() ;
        }
        invertedarray(arr,inarr,0);
        System.out.println(Arrays.toString(inarr));
    }
    public static void invertedarray(int arr[] , int inarr[], int i) {
        if (i == arr.length) {
            return;
        }
        inarr[arr[i]]=i;
        invertedarray(arr,inarr,i+1);

    }
}
