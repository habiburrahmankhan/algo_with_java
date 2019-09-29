package hackerblock;

import java.util.Stack;

public class DEQUEUSINGTWOstack {
    Stack primary ;
    Stack secondary ;
    public DEQUEUSINGTWOstack()
    {
        this.primary = new Stack();
        this.secondary = new Stack();
    }
    public void enque(int data)
    {
        while (!primary.isEmpty())
        {
            secondary.push(primary.pop());
        }
        primary.push(data);
        while(!secondary.isEmpty())
        {
            primary.push(secondary.pop());
        }
    }
    public  int dequeue()
    {
        return (int) primary.pop();
    }
    public void display()
    {
        for (int i = primary.size() -1; i >-1; i--) {
            System.out.println(primary.elementAt(i));
        }
    }

    public static void main(String[] args) {
        DEQUEUSINGTWOstack queue = new DEQUEUSINGTWOstack();
        queue.enque(10);
        queue.enque(20);
        queue.enque(30);
        queue.enque(40);
        queue.enque(50);
        System.out.println(" the deleted element is   "  + queue.dequeue() );
        queue.display();

    }
}
