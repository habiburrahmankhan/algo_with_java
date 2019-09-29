package hackerblock;

import java.util.Scanner;

public class matrixsearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int arr[][] = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = s.nextInt();
            }

        }
        int search = s.nextInt();
        System.out.println(search(arr,search));
    }

    public static int search(int arr[][], int search) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (search > arr[i][arr[i].length - 1]) {
                    break;
                } else {
                    if (search == arr[i][j]) {
                        return 1;
                    }
                }
            }
        }
        return 0;
    }
}