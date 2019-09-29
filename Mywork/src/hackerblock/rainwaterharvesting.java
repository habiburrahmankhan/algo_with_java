package hackerblock;

import java.util.Arrays;
import java.util.Scanner;

public class rainwaterharvesting {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        int n =s.nextInt() ;
        int arr[]  = new int[n] ;
        for(int i=0;i<arr.length ; i++)
        {
            arr[i] = s.nextInt() ;
        }
        System.out.println(harvest(arr));
    }
    public static int  harvest(int arr[])
    {
        int[] minleft = new int[arr.length];
        int[] minright = new int[arr.length];
        int count =0 ;
        int max=arr[0];
        minright[0]=max;
        for (int i = 1; i <arr.length ; i++) {
            if (arr[i] > max)
            {
                max=arr[i] ;
            }
            minright[i]=max;
        }
        max=arr[arr.length-1] ;
        minleft[arr.length-1]=max;
        for (int i = arr.length -2; i>=0 ; i--) {
            if (arr[i] > max)
            {
                max=arr[i] ;
            }
            minleft[i]=max;
        }
        for (int i = 0; i <arr.length ; i++) {
            if (Math.min(minleft[i] ,minright[i]) -arr[i] >0)
            {
                count +=Math.min(minleft[i] ,minright[i]) -arr[i];
            }
        }

        return count ;
    }


}
 //   10 0 2 1 3 0 1 2 1 2 1