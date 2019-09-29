package lecture4;

import java.util.Arrays;
import java.util.Scanner;

public class bublesorting {
    public static void main(String[] args) {

        int arr[] = new int[5];
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter the value in array ");
            arr[i] = s.nextInt();
        }
        // bublesort(arr);
        System.out.println(Arrays.toString(arr));
    }


    public static void bublesort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    lecture3.lecture4.swaparray.swap(arr, j, j + 1);
                }

            }
        }
    }
}
