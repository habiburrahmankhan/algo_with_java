package hackerblock;

import java.util.Scanner;

public class FoundAtLast {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        int n = s.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=s.nextInt();
        }
        int element = s.nextInt();
        System.out.println(foundlast(arr , element,arr.length-1));
    }
    public static int foundlast(int[] arr , int element,int i)
    {
        if (i==-1)
        {
            return -1;
        }

        if (arr[i]==element)
        {
            return i ;
        }
        return  foundlast(arr,element,i-1);
    }
}
