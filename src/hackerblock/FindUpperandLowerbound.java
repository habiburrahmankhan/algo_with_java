package hackerblock;

import java.util.Scanner;

public class FindUpperandLowerbound {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        int n=s.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=s.nextInt();
        }
        int test=s.nextInt();
        for (int i = 0; i < test; i++) {
            int element=s.nextInt();
            System.out.println(lower(arr , element) + " " + upper(arr , element));
        }
    }
    public  static int lower(int[] arr , int element)
    {
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==element)
            {
                return i ;
            }
        }
        return -1;
    }
    public  static int upper(int[] arr , int element)
    {
        for (int i = arr.length-1; i >=0 ; i--) {
            if (arr[i]==element)
            {
                return i ;
            }
        }
        return -1;
    }
}
