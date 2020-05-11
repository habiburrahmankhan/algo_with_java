package hackerblock;

import java.util.Scanner;

public class HELP_RAHUL_TO_SEARCH {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        int arr[]= new int[n];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=s.nextInt();
        }
        int search= s.nextInt();
        System.out.println(rahultosearch(arr , search));
    }

    private static int rahultosearch(int[] arr, int search) {
        int j = 0 ;
        for (int i = 0; i <arr.length-1 ; i++) {
            if (arr[i] > arr[i+1])
            {
                j=i;
                break;
            }
        }
     //   System.out.println(j);
        int start = 0 ;
        int end = j;
        while(start<=end)
        {
            int mid = (start + end)/2;
            if (arr[mid]==search)
            {
                return mid;
            }
            else if(arr[mid] > search)
            {
                end = mid -1 ;
            }
            else
            {
                start = mid +1 ;
            }
        }

        start = j+1 ;
        end = arr.length -1 ;
        while(start<=end)
        {
            int mid = (start + end)/2;
            if (arr[mid]==search)
            {
                return mid;
            }
            else if(arr[mid] > search)
            {
                end = mid -1 ;
            }
            else
            {
                start = mid +1 ;
            }
        }

        return  -1 ;
    }
}
