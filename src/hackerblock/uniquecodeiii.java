package hackerblock;

import java.util.Arrays;
import java.util.Scanner;

public class uniquecodeiii {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        unique(arr);
    }

    public static void unique(int[] arr) {
        int[] arrbit = new int[64];
        for (int i = 0; i < arr.length; i++) {
            int n = arr[i];
            int j = 0;
            while (n > 0) {

                arrbit[j]+=(n&1) ;
                j++;
                n = n>>1;

            }
        }
        int p=1;
        int ans = 0;
        for (int i = 0; i < arrbit.length; i++) {
            arrbit[i]%= 3;
            ans += arrbit[i]*p;
            p = p<<1;
        }
        System.out.println(ans);
    }
}

//7 12 12 12 13 13 13 4
//