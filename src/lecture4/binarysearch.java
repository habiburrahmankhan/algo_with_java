package lecture3.lecture4;

import java.util.Scanner;
// binary search is used on sorted data only

public class binarysearch {
    public static void main(String[] args) {
        int arr[] = new int[5] ;
        Scanner s = new Scanner(System.in) ;

        for (int i = 0; i < arr.length ; i++) {
            System.out.println("enter the value in array ");
            arr[i] = s.nextInt() ;
        }
        System.out.println("enter the elenent to be search ");
        int element = s.nextInt() ;
        System.out.println(binarysearch(arr , element));
    }

    public static  int binarysearch(int arr[] ,int element)
    {
        int start=arr[0];
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
