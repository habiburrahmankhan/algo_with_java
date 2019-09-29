package lecture_7;

public class binarysearchrecursion {
    public static void main(String[] args) {
        int arr[]={1,2,3,5,6,15};
        int element=3;
        System.out.println(binarysearch(arr ,0,arr.length-1 ,element));

    }
    public static int binarysearch(int arr[] ,int start,int end ,int element)
    {

       if(start==end)
       {
           return -1 ;
       }
        int mid=(start + end)/2 ;
        if (arr[mid]==element)
        {
           return mid ;
        }
       if (arr[mid]<element)
       {
           return binarysearch(arr,mid+1 ,end,element);
       }
       return binarysearch(arr,start,mid-1 ,element) ;
    }
}
