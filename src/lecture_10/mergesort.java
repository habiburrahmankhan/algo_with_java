package lecture_10;

        import java.util.Arrays;
        import java.util.Scanner;

public class mergesort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        int arr[]={4,6,7,3,2,5} ;

        System.out.println(Arrays.toString(mergesort(arr)));

    }
    public static int[] mergesort(int arr[])
    {
            if(arr.length==1)
            {
                return arr ;
            }
            int mid=arr.length/2 ;
            int first[] = mergesort(Arrays.copyOfRange(arr,0,mid));
            int second[]=mergesort(Arrays.copyOfRange(arr,mid,arr.length)) ;

            return merge (first,second) ;

    }
    public static int[] merge(int first[] ,int second[])
    {       int i=0 ,j=0;
          int k=0;
            int arr[]=new int[first.length + second.length] ;
        while(i<first.length && j<second.length)
        {
            if (first[i]<second[j])
            {
                arr[k]=first[i];
                i++;
            }
            else
            {
                arr[k]=second[j];
                j++;
            }
            k++;
        }
        while (i<first.length)
        {
            arr[k]=first[i];
                    i++;
                    k++;
        }
        while (j<second.length)
        {
            arr[k]=second[j] ;
            j++;
            k++;
        }


       return  arr ;
    }
}
