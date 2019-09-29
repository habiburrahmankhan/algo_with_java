package assignment6;

import java.util.Scanner;

public class linearsearch {
    public static void main(String[] args) {
        int arr[] = new int[5] ;
        Scanner s = new Scanner(System.in) ;

        for (int i = 0; i < arr.length ; i++) {
            System.out.println("enter the value in array ");
            arr[i] = s.nextInt() ;
        }
        System.out.println("enter the element to be search ...");
        int element = s.nextInt() ;
        System.out.println(linsearch(arr,0,element));
    }
    public static boolean linsearch(int arr[],int i ,int element)
    {
        if (i==arr.length)
        {
            return false ;
        }
        if (arr[i]==element)
        {
            return true ;
        }
        return linsearch(arr,i+1 , element);
    }
}
