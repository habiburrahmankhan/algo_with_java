package hackerblock;

import java.util.Scanner;

public class merge_Sort_Practice {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=s.nextInt();
        }
        int merge[] = mergesort(arr , 0 , arr.length-1);
        for (int i = 0; i <n ; i++) {
            System.out.print(merge[i] + " ");
        }
    }

    private static int[] mergesort(int[] arr, int start, int end) {
        if (start==end)
        {
             int b[] =  new  int[1] ;
             b[0] = arr[start] ;
            return  b;
        }
        int mid = (start + end ) /2 ;
        int first[] = mergesort(arr , start , mid ) ;
        int second [] = mergesort(arr , mid +1 , end ) ;

        return  merge(first , second ) ;
    }
    private  static  int[] merge(int first[] , int second[])
    {
        int final_arr[]  = new  int[first.length + second.length] ;
        int  i = 0 , j = 0 , k = 0 ;
        while(i < first.length && j < second.length)
        {
            if (first[i] >= second[j] )
            {
                final_arr[k] = second[j] ;
                j++ ;
                k++ ;
            }
            else
            {
                final_arr[k] = first[i] ;
                i++ ;
                k++ ;
            }

        }
        if (i==first.length)
        {
            while (j < second.length)
            {
                final_arr[k] = second[j] ;
                j++ ;
                k++ ;
            }
        }
        if (j==second.length)
        {
            while (i < first.length)
            {
                final_arr[k] = first[i] ;
                i++ ;
                k++ ;
            }
        }


        return  final_arr ;
    }
}
