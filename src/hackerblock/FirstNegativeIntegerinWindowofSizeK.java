package hackerblock;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FirstNegativeIntegerinWindowofSizeK {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t =s.nextInt();
        for (int i = 0; i < t; i++) {
            int n = s.nextInt();
            int arr[] = new int[n];
            int k=s.nextInt();
            for (int j = 0; j < n; j++) {
                arr[j]=s.nextInt();
            }
            firstnegativeinteger(arr ,k);

        }
    }
    public static void firstnegativeinteger(int arr[] , int k)
    {
        Queue<Integer> queue = new LinkedList<Integer>();
        for (int i = 0; i <k ; i++) {
            if (arr[i]<0)
            {
                queue.add(i);
            }
        }
        for (int i = k; i < arr.length; i++) {
            if (!queue.isEmpty())
            {
                System.out.print(arr[queue.peek()] + " ");
            }
            else
            {
                System.out.print("0" + " ");
            }
            if (arr[i]<0)
            {
                queue.add(i);
            }
            while (!queue.isEmpty() && queue.peek()<=i-k)
            {
                queue.remove();
            }
        }
        if (!queue.isEmpty())
        {
            System.out.print(arr[queue.peek()] + " ");
        }
        else
        {
            System.out.print("0" + " ");
        }
    }
}
