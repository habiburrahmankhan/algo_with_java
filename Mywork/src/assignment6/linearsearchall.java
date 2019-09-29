package assignment6;

import java.util.Arrays;
import java.util.Scanner;

public class linearsearchall {
    public static void main(String[] args) {
        int arr[] = new int[5] ;
        Scanner s = new Scanner(System.in) ;
        int arindice[] =new int[5] ;
        for (int i = 0; i < arr.length ; i++) {
            System.out.println("enter the value in array ");
            arr[i] = s.nextInt() ;
        }
        System.out.println("enter the element to be search ...");
        int element = s.nextInt() ;
        int [] ans =linsearch(arr,0,0,element) ;
        System.out.println(Arrays.toString(ans));
    }
    public static int[] linsearch(int arr[],int count ,int i ,int element)
    {
        int arindice[]=null ;
        if (i==arr.length)
        {
            int[] base = new int[count];
            return base ;
        }
        if (arr[i]==element)
        {
            arindice =linsearch(arr,count + 1,i+1 , element); ;
        }
        else
        {
            arindice=  linsearch(arr,count,i+1 , element);
        }
        if (arr[i]==element)
        {
            arindice[count]=i;
        }
        return arindice ;
    }
}