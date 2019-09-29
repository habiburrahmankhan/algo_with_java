package lecture_7;

public class linearsearch {
    public static void main(String[] args) {
        int arr[]={1,2,34,454,6,45};
        int element=6;
        System.out.println(linear(arr ,0,element));
    }
    public static boolean linear(int ar[] , int index, int element)
    {
        if (index==ar.length)
        {
            return false ;
        }
        if(ar[index]==element)
        {
            return true ;
        }
        return  linear(ar ,index +1 ,element) ;
    }
}
