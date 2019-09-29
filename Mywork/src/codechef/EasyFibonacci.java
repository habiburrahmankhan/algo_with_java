package codechef;

import java.util.Arrays;
import java.util.Scanner;

public class EasyFibonacci {
    public static void main(String[] args)  {
        try {
            Scanner s = new Scanner(System.in);
            int t = s.nextInt();
            int arr[] = new int[t];
            int max=0;
            for (int i = 0; i <t ; i++) {
                arr[i]=s.nextInt();
                if (max < arr[i])
                {
                    max=arr[i];
                }
            }
            int fiboarr[]=new  int[max];
            fibo(fiboarr ,max);


            for (int i = 0; i < t; i++) {
                int k=1;
                for (int j = 0; j <arr[i] && k<=arr[i]; j++) {
                    k=k*2;
                }
                System.out.println(fiboarr[k/2 -1]);
            }

        }
        catch (Exception e)
        {
            return ;
        }



    }
    public static  void fibo(int[] arr ,int max)
    {
         arr[0] =0 ;
         arr[1]=1;
        for (int n = 2; n <max; n++) {
           arr[n]=arr[n-1] + arr[n-2] ;
           arr[n]=arr[n]%10;
        }
        System.out.println(Arrays.toString(arr));

    }
}
