package hackerblock;

import java.util.Scanner;

public class stricklyincreasingdecreasing {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        int n = s.nextInt();
        int arr[]=new int[n] ;
        for (int i = 0; i <arr.length ; i++) {
              arr[i]=s.nextInt();
        }
        System.out.println(increasedecrease(arr));
    }
    public static Boolean increasedecrease(int[] arr)
    {
          int no=arr[0];
          int i=0;
        for ( i = 1; i <arr.length ; i++) {
            if(no==arr[i])
            {
                return false ;
            }
            if (no < arr[i])
            {
                no=arr[i];
                break;
            }
            else
            {
                no=arr[i] ;
            }
        }
        for (int j = i; j <arr.length-1 ; j++) {
            if (no ==arr[j+1])
            {
              return false ;
            }
            if (no <arr[j+1])
            {
                no=arr[j+1];
            }
            else
            {
                return false ;
            }
        }

        return true;
    }



  //  5 65 51 41 45 45
}
