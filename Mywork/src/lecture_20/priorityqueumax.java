package lecture_20;
import java.util.Collections;
import java.util.PriorityQueue;
public class priorityqueumax {

    public static void main(String[] args) {
        PriorityQueue priority = new PriorityQueue(Collections.reverseOrder()) ;
        priority.add(20);
        priority.add(10);
        priority.add(50);
        System.out.println(priority.remove());
        System.out.println();
    }

}
