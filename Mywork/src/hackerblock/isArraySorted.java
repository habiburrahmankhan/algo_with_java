package hackerblock;

import java.util.Scanner;

public class isArraySorted {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=s.nextInt();
        }
        System.out.println(isSorted(arr ,0));
    }

    private static boolean isSorted(int[] arr , int i) {

        if (arr.length-1==i)
        {
            return true ;
        }
        if (arr[i] > arr[i+1])
        {
            return false ;
        }
      return isSorted(arr , i+1);
    }
}
