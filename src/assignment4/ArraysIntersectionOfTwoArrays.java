package assignment4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArraysIntersectionOfTwoArrays {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        int n = s.nextInt();
        int arr1[] =new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i]=s.nextInt();
        }
        int arr2[] =new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i]=s.nextInt();
        }
         ArrayList<Integer> ar = intersectionofarrays(arr1 , arr2);
        Collections.sort(ar);
        System.out.println(ar.toString());
    }

    private static ArrayList<Integer> intersectionofarrays(int[] arr1, int[] arr2) {
        ArrayList<Integer> arr = new ArrayList<>();
        boolean arr3[] = new boolean[arr2.length];
        for (int i = 0; i <arr1.length ; i++) {
            for (int j = 0; j <arr1.length ; j++) {
                if (arr1[i]==arr2[j] && arr3[j]==false)
                {
                    arr.add(arr1[i]);
                    arr3[j]=true;
                    break ;
                }
            }
        }


        return arr ;
    }
}
