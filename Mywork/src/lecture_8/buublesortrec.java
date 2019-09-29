package lecture_8;

import java.util.Arrays;

public class buublesortrec {
    public static void main(String[] args) {
        int arr[]={1,13,11,16,67};
        bubblesort(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubblesort(int arr[] ,int row ,int col)
    {
        if(row==0)
        {
            return ;
        }
        if(row==col)
        {
            bubblesort(arr,row-1,0);
            return ;
        }
        if (arr[col]>arr[col+1])
        {
            swap(arr,col);
        }
        bubblesort(arr,row,col+1);
    }
    public static void swap(int arr[] , int row)
    {
            int temp= arr[row];
            arr[row]=arr[row+1] ;
            arr[row+1]=temp ;
    }
}
