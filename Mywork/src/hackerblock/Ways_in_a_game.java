package hackerblock;

import java.util.Scanner;

public class Ways_in_a_game {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(game(n));
    }
    private static int game(int n)
    {
        int arr[] = new int[n+1];
        arr[0]=1;
        for (int i = 3; i <arr.length ; i++) {
           arr[i]+=arr[i-3];
        }
        for (int i = 5; i <arr.length ; i++) {
            arr[i]+=arr[i-5];
        }
        for (int i = 10; i <arr.length ; i++) {
        arr[i]+=arr[i-10];

    }
        return  arr[n];
    }



}
