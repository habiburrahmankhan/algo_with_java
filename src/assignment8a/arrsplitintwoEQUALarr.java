package assignment8a;

public class arrsplitintwoEQUALarr {
    public static void main(String[] args) {
        int arr[]={1,3,5,7,0} ;
         splitarr(arr,0,0,0);
    }

    public static void splitarr(int arr[] , int sum1 ,int sum2 ,int i )
    {
            if (i==arr.length)
            {
                return ;
            }
            sum1+=arr[i];


    }
}
