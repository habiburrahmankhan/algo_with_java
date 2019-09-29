package hackerblock;

import java.util.Scanner;

public class findgreatestelement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        int n =s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=s.nextInt();
        }
        for (int i = 0; i <n-1 ; i++) {
                if (arr[i]< arr[i+1])
                {
                    System.out.print(arr[i+1] + " ");
                }
                else {
                    System.out.print("-1 ");
                }
        }
        if (arr[n-1] <arr[0])
        {
            System.out.print(arr[0] + " ");
        }
        else {
            System.out.print("-1 ");
        }

    }
}
