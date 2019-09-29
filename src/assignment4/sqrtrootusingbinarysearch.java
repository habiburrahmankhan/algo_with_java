package assignment4;

import java.util.Scanner;

public class sqrtrootusingbinarysearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        System.out.println("enter the value of n ");
        int n =s.nextInt() ;
        System.out.println("enter the value of precision ");
       int precison = s.nextInt() ;
       float error =(float)0.1 ;    //0.1f
        System.out.println( sqrtprecison(n,precison ,error));
        System.out.printf("%."+precison + "f" ,sqrtprecison(n,precison,error));
    }

    public static float  sqrtprecison(int n, int precison ,float error)
    {
        int start=1;
        int end = n;
        float ans=0 ;
        while(start<=end)
        {
            int mid=(start + end)/2  ;
            if(mid*mid==n)
            {
               return mid ;

            }
            else if (mid*mid < n)
            {
                ans=mid ;
                start=mid + 1 ;
            }
            else
            {
                end=mid -1 ;
            }
        }

        for (int i = 0; i <precison; i++) {
            while (ans*ans<n )
            {
                ans=ans+error ;
            }
            ans-=error ;
            error/=10 ;
        }

       return ans ;
    }

}
