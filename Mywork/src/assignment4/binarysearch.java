package assignment4;

import java.util.Scanner;

public class binarysearch {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in) ;
            System.out.println("enter the size of an array ");
            int n =s.nextInt() ;
            int arr[]  = new int[n] ;
            System.out.println("enter the sorted array ") ;
            for(int i=0;i<arr.length ; i++)
            {
                arr[i] = s.nextInt() ;
            }
            System.out.println("enter the value to search   ") ;
            int m = s.nextInt() ;
            System.out.println(binarysearch(arr , m));
    }
    public static int binarysearch(int arr[] , int m)
        {
            int start=0 , end=arr.length-1 ;
            while(start<=end)
            {
                int mid=(start+ end)/2 ;
                if(arr[mid]==m)
                {
                    return mid ;
                }
                else if(arr[mid]<m)
                {
                    start=mid+1;
                }
                else
                {
                    end=mid -1 ;
                }
            }
            return -1;
            }

}
