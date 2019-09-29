package hackerblock;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueuePushEfficient {



        Queue<Integer> primary = new LinkedList<>();
        Queue<Integer> secondary = new LinkedList<>();
        public void push(int val)
        {
            primary.add(val);
        }
        public int pop()
        {
            while (primary.size()!=1)
            {
                secondary.add(primary.remove());
            }
            int element = primary.remove();
            while (!secondary.isEmpty())
            {
                primary.add(secondary.remove());
            }
            return element;
        }

        public int top()
        {
            while (primary.size()!=1)
            {
                secondary.add(primary.remove());
            }
            int element = primary.peek();
            secondary.add(primary.remove());
            while (!secondary.isEmpty())
            {
                primary.add(secondary.remove());
            }
            return element;
            
        }
        public void display()
        {
            while (!primary.isEmpty())
            {
                System.out.println(pop());
            }
        }
        

    public static void main(String[] args) {
        StackUsingQueuePushEfficient stk = new StackUsingQueuePushEfficient();
        stk.push(10 );
        stk.push(20 );
        stk.push(30 );
        stk.push(40 );
        stk.push(50 );
        System.out.println("the pop element " + stk.pop());
        System.out.println("the top element " +stk.top());
        stk.display();
    }

}
