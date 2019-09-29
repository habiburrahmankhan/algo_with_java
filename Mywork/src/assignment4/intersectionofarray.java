package assignment4;

import java.util.Arrays;
import java.util.Scanner;

public class intersectionofarray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        System.out.println("enter the size of an array ");
        int n =s.nextInt() ;
        int arr1[]  = new int[n] ;
        System.out.println("enter the array ") ;
        for(int i=0;i<arr1.length ; i++)
        {
            arr1[i] = s.nextInt() ;
        }
        System.out.println("enter the size of an array ");
        int m =s.nextInt() ;
        int arr2[]  = new int[m] ;
        System.out.println("enter the array ") ;
        for(int i=0;i<arr2.length ; i++)
        {
            arr2[i] = s.nextInt() ;
        }
        System.out.println(Arrays.toString(arr1)+ Arrays.toString(arr2) + Arrays.toString(intersection(arr1,arr2)));
    }
    public static int[] intersection(int arr1[] ,int arr2[])
    {
       int arr3[] = new int[arr1.length] ;
       int flag[] = new int[arr2.length];
        for (int i = 0; i <flag.length ; i++) {
            flag[i] = -1 ;
        }
        for (int i = 0; i <arr1.length ; i++) {
            for (int j = 0; j <arr2.length ; j++) {
                if(arr1[i]==arr2[j] && flag[j]==-1)
                {
                    arr3[i]=arr1[i] ;
                    flag[j]=0 ;
                    break ;
                }
            }

        }
        return arr3 ;
    }
}
