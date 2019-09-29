package lecture_20;

import java.util.PriorityQueue;

public class priorityQueu {
    public static void main(String[] args) {
        PriorityQueue priority = new PriorityQueue() ;
        priority.add(20);
        priority.add(10);
        priority.add(50);
        System.out.println(priority.remove());
    }

}
