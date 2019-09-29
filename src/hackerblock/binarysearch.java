package hackerblock;

import java.util.Scanner;

public class binarysearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=s.nextInt();
        }
        int element = s.nextInt();
        System.out.println(BinarySearch(arr , element));
    }
    public static  int BinarySearch(int arr[] ,int element)
    {
        int start=0;
        int end=arr.length - 1;
        while(start<=end)
        {
            int mid=(start+ end)/2 ;
            if(arr[mid]==element)
            {
                return mid ;
            }
            else if (arr[mid]<element)
            {
                start = mid +1 ;
            }
            else
            {
                end = mid - 1 ;
            }
        }
        return -1 ;
    }
}
