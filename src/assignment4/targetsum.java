package assignment4;

import java.util.Scanner;

public class targetsum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        System.out.println("enter the size of an array ");
        int n =s.nextInt() ;
        int arr[]  = new int[n] ;
        System.out.println("enter the  array ") ;
        for(int i=0;i<arr.length ; i++)
        {
            arr[i] = s.nextInt() ;
        }
        System.out.println("enter the target value  ") ;
        int m = s.nextInt() ;
        target(arr , m) ;
    }

    public static void target(int arr[] , int m)
    {
        for (int i = 0; i < arr.length; i++) {
            {
                for (int j = 0; j <arr.length ; j++) {
                      if (i==j)
                      {
                          continue;
                      }
                      else
                      {
                          if (arr[i]+ arr[j]==m)
                          {
                              System.out.println(arr[i] + " and " + arr[j]);
                          }
                      }
                }
            }
        }
    }
}
