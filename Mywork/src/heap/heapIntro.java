package heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class heapIntro {
    public static void main(String[] args) {
        PriorityQueue<Integer> min_heap = new PriorityQueue<Integer>();
        min_heap.add(10 ) ;
        min_heap.add(20 ) ;
        min_heap.add(15 ) ;
        min_heap.add(35 ) ;
        min_heap.add(4 ) ;
        min_heap.add(34);
        System.out.println(min_heap.peek());
        System.out.println(min_heap.remove());
        for (Integer i:min_heap) {
            System.out.println(i);
        }
        System.out.println("In min heap only parent node in smallest whole heap is not sorted ");
        while (!min_heap.isEmpty())
        {
            System.out.println(min_heap.remove());
        }

        PriorityQueue<Integer> max_heap = new PriorityQueue<Integer>(Collections.reverseOrder());
        max_heap.add(10 ) ;
        max_heap.add(20 ) ;
        max_heap.add(15 ) ;
        max_heap.add(35 ) ;
        max_heap.add(4 ) ;
        max_heap.add(34);
        System.out.println(max_heap.peek());
        System.out.println(max_heap.remove());
        for (Integer i: max_heap) {
            System.out.println(i);
        }
        System.out.println("In mma heap only parent node in largest whole heap is not sorted ");
        while (!max_heap.isEmpty())
        {
            System.out.println(max_heap.remove());
        }


    }
}
