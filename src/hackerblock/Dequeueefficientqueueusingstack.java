package hackerblock;

import java.util.Scanner;
import java.util.Stack;

public  class Dequeueefficientqueueusingstack {
    private static class Deeque
    {
        Stack primary;
        Stack secondary;
        public Deeque()
        {
            primary = new Stack();
            secondary = new Stack();
        }
        public void enque ( int data)
        {
            while (!primary.isEmpty()) {
                secondary.push(primary.pop());
            }
            primary.push(data);
            while (!secondary.isEmpty()) {
                primary.push(secondary.pop());
            }
        }
        public int dequeue ()
        {
            return (int) primary.pop();
        }
    }
    public static void main(String[] args) {
        Deeque queue = new Deeque();
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        for (int i = 0; i <n ; i++) {
            queue.enque(i);
        }
        for (int i = 0; i <n ; i++) {
            System.out.print(queue.dequeue() + " ");
        }
    }
}
