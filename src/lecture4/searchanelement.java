package lecture3.lecture4;

import java.util.Arrays;
import java.util.Scanner;

public class searchanelement {
    public static void main(String[] args) {

        int arr[] = new int[5] ;
        Scanner s = new Scanner(System.in) ;

        for (int i = 0; i < arr.length ; i++) {
            System.out.println("enter the value in array ");
            arr[i] = s.nextInt() ;
        }
        System.out.println("enter the element to search ");
        int searchelement = s.nextInt() ;

        System.out.println(linearsearch(arr ,searchelement));
         if(linearsearch(arr ,searchelement))
         {
             System.out.println("element found ");
         }
         else
         {
             System.out.println("element not found ");
         }


//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]==searchelement)
//            {
//                System.out.println("data found ");
//                break ;
//            }
//        }
//        System.out.println(Arrays.toString(arr));

    }


//    public static int linearsearch(int arr[] , int element)
//    {
//        for (int i = 0; i <arr.length ; i++) {
//            if(arr[i]==element)
//            {
//                return i;
//            }
//        }
//        return -1 ;
//    }


    public static boolean linearsearch(int arr[] , int element)
    {
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==element)
            {
                return true;
            }
        }
        return false ;
    }


}
