package hackerblock;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AllIndicesProblem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr =new int[n] ;
        for (int i = 0; i <n ; i++) {
            arr[i]=s.nextInt();
        }
        int element = s.nextInt();
        ArrayList ar = new ArrayList() ;
        ArrayList<Integer> ar12 = allindice(arr , element ,0 ,ar);
        for (int a:ar12) {
            System.out.print(a +  " ");
        }
    }

    public  static ArrayList allindice(int[] arr , int element , int i , ArrayList ar )
    {

        if (i==arr.length)
        {
            return ar ;
        }
        if (arr[i]==element)
        {
            ar.add(i);
        }
        return  allindice(arr, element , i+1 ,ar) ;

    }
}
