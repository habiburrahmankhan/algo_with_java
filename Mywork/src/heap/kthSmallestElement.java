package heap;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class kthSmallestElement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int arr[] = new int[n] ;
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        PriorityQueue<Integer> max_heap = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i <n ; i++) {
             max_heap.add(arr[i]) ;
             if (max_heap.size() > k )
             {
                 max_heap.remove() ;
             }
        }
        System.out.println(max_heap.peek());
    }
}
