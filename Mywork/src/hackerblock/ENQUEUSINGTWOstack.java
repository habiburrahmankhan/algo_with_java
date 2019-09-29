package hackerblock;

import java.util.Stack;

public class ENQUEUSINGTWOstack {
    Stack primary ;
    Stack secondary ;
    public  ENQUEUSINGTWOstack()
    {
        this.primary = new Stack();
        this.secondary = new Stack();
    }
    public void enque(int data)
    {
        primary.push(data);

    }
    public  int dequeue()
    {
       while(primary.size()!=1)
       {
           secondary.push(primary.pop());
       }
       int element = (int)primary.pop();
       while(!secondary.isEmpty())
       {
           primary.push(secondary.pop());
       }
       return element;
    }
    public int front()
    {
        while(primary.size()!=1)
        {
            secondary.push(primary.pop());
        }
        int element = (int) primary.peek();
        while(!secondary.isEmpty())
        {
            primary.push(secondary.pop());
        }
        return  element;
    }
    public void display()
    {
        for (int i = primary.size() -1; i >-1; i--) {
            System.out.println(primary.elementAt(i));
        }
    }

    public static void main(String[] args) {
        ENQUEUSINGTWOstack queue = new ENQUEUSINGTWOstack();
        queue.enque(10);
        System.out.println(" the deleted element is   "  + queue.dequeue() );
        queue.enque(20);
        queue.enque(30);
        queue.enque(40);
        queue.enque(50);
        System.out.println(" the deleted element is   "  + queue.dequeue() );
        System.out.println("the front elenemt is   " + queue.front());
        queue.display();

    }
}
