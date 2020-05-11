package hackerblock;

import java.util.Scanner;
import java.util.Stack;

public class Intersection_point_two_linked_lists {
    private class Node
    {
        int data ;
        Node next ;
        public Node(int data )
        {
            this.data=data ;
            this.next =null;
        }
    }

    private Node Head  =null ;
    private Node Last = null ;
    private void addLast(int data)
    {
        Node node = new Node(data);
        node.next=null;
        if (this.Head==null)
        {
            Head=node;
            Last=node;
        }
        else
        {
            this.Last.next=node;
            this.Last=node;
        }
    }
    private void display()
    {
        display(Head);
    }
    public void display(Node head)
    {
        Node temp = head;
        while (temp!=null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }

    }
    public static void main(String[] args) {

        Intersection_point_two_linked_lists llone = new Intersection_point_two_linked_lists();
        Scanner s  = new Scanner(System.in);

            int n = s.nextInt();
        for (int i = 0; i <n ; i++) {
            int data = s.nextInt();
            llone.addLast(data);
        }
      //   llone.display();
        Intersection_point_two_linked_lists lltwo = new Intersection_point_two_linked_lists();
         n = s.nextInt();
        for (int i = 0; i <n ; i++) {
            int data = s.nextInt();
            lltwo.addLast(data);
        }
       // lltwo.display();
        System.out.println(intersection(llone , lltwo));
        }
        public static int intersection(Intersection_point_two_linked_lists ll1 ,Intersection_point_two_linked_lists ll2)
        {
            Stack<Node> stk1 = new Stack<>();
            Stack<Node> stk2 = new Stack<>();
            Node temp = ll1.Head ;
            while (temp!=null)
            {
                stk1.push(temp);
                temp=temp.next;

            }
            temp=ll2.Head;
            while (temp!=null)
            {
                stk2.push(temp);
                temp=temp.next;

            }
            while (true && !stk1.isEmpty() && !stk2.isEmpty())
            {
                Node temp1 = stk1.pop();
                Node temp2 = stk2.pop();
                if (temp1.data==temp2.data)
                {
                    temp = temp1;

                }
                else
                {
                 break;
                }
            }
            return temp.data  ;
        }
    }



