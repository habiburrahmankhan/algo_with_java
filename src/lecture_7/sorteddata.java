package lecture_7;

public class sorteddata {
    public static void main(String[] args) {
       int arr[]={ 1,2,3,4} ;
        System.out.println(sorted(arr,0));
    }
    public static boolean sorted(int ar[] , int index)
    {
                if (index==ar.length-1)
                {
                    return true ;
                }
            if(ar[index]> ar[index+1])
            {
                return false ;
            }

        return  sorted(ar ,index +1) ;
        }



    }

