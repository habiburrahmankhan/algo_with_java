package hackerblock;

import java.util.Scanner;

public class Kth_element_from_last_in_linkedList {

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
    private int kthelementfromLast(int k)
    {
        return kthelementfromLast(Head ,k);
    }
    public  int kthelementfromLast(Node head , int k )
    {
       Node last = head ;
       Node forward = head ;
        for (int i = 0; i <k-1; i++) {
            forward=forward.next;
        }
        while (forward.next!=null)
        {
            last=last.next;
            forward=forward.next;
        }
        return last.data ;
    }
    public static void main(String[] args) {
      Kth_element_from_last_in_linkedList ll = new Kth_element_from_last_in_linkedList();
        Scanner s  = new Scanner(System.in);
         while (true)
         {
             int n = s.nextInt();
             if (n==-1)
             {
                 break;
             }
             ll.addLast(n);
         }
        ll.display();
         int k = s.nextInt();
        System.out.println(ll.kthelementfromLast(k));
    }
}
