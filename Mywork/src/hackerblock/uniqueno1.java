package hackerblock;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class uniqueno1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr= new int[n];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=s.nextInt();
        }
        //unique(arr);
        unique1(arr);
    }
    public static void unique(int[] arr)
    {
        int s=arr[0];
        for (int i = 1; i <arr.length ; i++) {
            s=s ^ arr[i] ;
        }
        System.out.println(s);
    }
    public static void unique1(int[] arr)
    {
        ArrayList ar = new ArrayList();
        int k=1;
        for (int i = 0; i <arr.length ; i++) {
            k=0;
            for (int j = 0; j <arr.length  ; j++) {
                if((arr[j] ^ arr[i])==0 && i!=j){
                    break ;
                }
                k++;
            }
            if (k==arr.length)
            {
                System.out.println(k);
                ar.add(arr[i]);
            }

        }
        for (int i = 0; i <ar.size() ; i++) {
            System.out.print(ar.get(i) + " ");
        }
    }
}
