package lecture3.lecture4;

import java.util.Arrays;
import java.util.Scanner;

public class arradd10elementtoeach {
    public static void main(String[] args) {
        int arr[] = new int[5] ;
        Scanner s = new Scanner(System.in) ;

        for (int i = 0; i < arr.length ; i++) {
            System.out.println("enter the value in array ");
            arr[i] = s.nextInt() + 10 ;
           // arr[i] +=10 ;
        }
        System.out.println(Arrays.toString(arr));
    }
}
