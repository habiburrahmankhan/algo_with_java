package assignment4;

import java.util.Scanner;

public class uniqueness {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]= s.nextInt();
        }
        System.out.println(deletion(arr));
    }
    public static int deletion(int[] arr)
    {
        int element=0;
        for (int i = 0; i <arr.length-1; i++) {
            for (int j = i+1; j <arr.length ; j++) {
               int  s= arr[i] ^ arr[j] ;
                if (s==0)
                {
                    element++;
                }
            }
        }
        return element ;
    }

}
