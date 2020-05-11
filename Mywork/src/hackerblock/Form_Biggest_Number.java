package hackerblock;

import java.util.Arrays;
import java.util.Scanner;

public class Form_Biggest_Number {
    public static void main(String[] args) {
        Scanner  s = new Scanner(System.in);
        int test = s.nextInt();
        for (int i = 0; i <test ; i++) {
            int n =s.nextInt();
            int arr[] = new int[n];
            for (int j = 0; j <arr.length ; j++) {
                arr[j]=s.nextInt();
            }
            System.out.println(biggestno(arr));
        }
    }

    private static String biggestno(int[] arr) {
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (mixarra(arr[i] , arr[j]))
                {
                    swap(arr , i , j);
                }
            }
        }

       // System.out.println(Arrays.toString(arr));
         String ans="" ;
        for (int i = 0; i <arr.length ; i++) {
            ans+=arr[i];
        }

        return ans;
    }

    private static void swap( int arr[],int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j] ;
        arr[j] = temp ;
    }

    private static boolean mixarra(int x, int y) {
        int xy =Integer.parseInt(( Integer.toString(x) + Integer.toString(y)));
        int yx =Integer.parseInt(( Integer.toString(y) + Integer.toString(x)));
        if (xy < yx)
        {
            return true;
        }
        else
        {
            return  false;
        }
    }
}
