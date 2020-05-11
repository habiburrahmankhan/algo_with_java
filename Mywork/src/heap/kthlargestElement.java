package heap;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class kthlargestElement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int arr[] = new int[n] ;
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        PriorityQueue<Integer> min_heap = new PriorityQueue<>();
        for (int i = 0; i <n ; i++) {
            min_heap.add(arr[i]) ;
            if (min_heap.size() > k )
            {
                min_heap.remove() ;
            }
        }
        System.out.println(min_heap.peek());
    }
}
