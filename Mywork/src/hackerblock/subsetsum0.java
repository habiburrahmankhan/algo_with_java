package hackerblock;

import java.util.Scanner;

public class subsetsum0
{
    public static void main(String[] args) {
        Scanner s  =new Scanner(System.in);

        int test = s.nextInt();
        for (int j = 0; j <test ; j++) {

            int n =s.nextInt();
            int arr[] = new int[n] ;
            for (int i = 0; i < arr.length; i++) {
                arr[i]=s.nextInt();
            }
            subset(arr);
        }


    }
    public static void subset(int[] arr)
    {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j <arr.length ; j++) {
                int sum=0 ;
                for (int k = i; k <=j; k++) {
                    sum+=arr[k];
                }
                if (sum==0)
                {
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");
        return ;
    }
}
