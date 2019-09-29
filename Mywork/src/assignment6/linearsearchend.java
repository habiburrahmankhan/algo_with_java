package assignment6;

import java.util.Scanner;

public class linearsearchend {
    public static void main(String[] args) {
        int arr[] = new int[5] ;
        Scanner s = new Scanner(System.in) ;

        for (int i = 0; i < arr.length ; i++) {
            System.out.println("enter the value in array ");
            arr[i] = s.nextInt() ;
        }
        System.out.println("enter the element to be search ...");
        int element = s.nextInt() ;
        System.out.println(linsearch(arr,arr.length-1,element));

    }
    public static int linsearch(int arr[],int i ,int element)
    {
        if (i==-1)
        {
            return -1 ;
        }
        if (arr[i]==element)
        {
            return i ;
        }
      return linsearch(arr,i-1 , element);


    }


}