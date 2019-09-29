package lecture3.lecture4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class arrayexample {
    public static void main(String[] args) {
        int arr[] = new int[5] ;
        int ar1[] = {1,2,3,4,5} ;
        Scanner s = new Scanner(System.in) ;

        for (int i = 0; i < arr.length ; i++) {
            System.out.println("enter the value in array ");
            arr[i] = s.nextInt() ;
        }

        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);

        }

        System.out.println(Arrays.toString(arr));  // [1, 2, 3, 4, 5]
        System.out.println(ar1);
    }
}
