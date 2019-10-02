package hackerblock;

import java.util.Arrays;
import java.util.Scanner;

public class length_sum {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int len = s.nextInt();
        int sum = s.nextInt();

        int arr[]  =new int[len];
        int i=0;
        int sum2=sum;
        while(i< arr.length)
        {
            int r = sum - (arr.length  -i -1)*9;
            if (i==0 & sum<9)
            {
                arr[i]=1;
                r =1 ;
            }
            else if (r==0)
            {
                arr[i]=1;
                r=1 ;
            }
            else if (r<0)
            {
                arr[i]=0;
                r=0 ;
            }
            else
            {
                arr[i]=r ;
            }

            sum = sum - r  ;
            i++;
        }
        System.out.println(Arrays.toString(arr));
        i=0 ;
        int m=0 ;

        while (i<arr.length)
        {
            m+=arr[i];
            i++;
        }
        System.out.println(m);
        System.out.println(sum2);
        if (sum2==m)
        {
            int j=0;
            while (j<arr.length) {
                System.out.print(arr[j]);
                j++;
            }

        }
        else
        {
            System.out.println("-1");
        }

    }
}
// 10