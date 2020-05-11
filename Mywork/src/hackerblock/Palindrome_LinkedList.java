package hackerblock;

import trees.heap.Heap;

import java.util.Scanner;

public class Palindrome_LinkedList {

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
    private Node getNode(int k )
    {
        return  getNode(Head ,k);
    }
    private Node getNode(Node temp , int k )
    {
        for (int i = 0; i <k-1 ; i++) {
            temp=temp.next;
        }
        return temp;
    }
    private boolean palidrome(int m)
    {
        return palidrome(Head , m);
    }
    public boolean palidrome(Node temp , int m)
    {
        while(temp!=null) {
            Node node = getNode(m);
            if (node.data != temp.data) {
              return false;
            }
            temp=temp.next;
            m=m-1;
        }
        return true;
    }
    public static void main(String[] args) {
        Palindrome_LinkedList ll = new Palindrome_LinkedList();
        Scanner s  = new Scanner(System.in);
            int n = s.nextInt();
        for (int i = 0; i <n ; i++) {
            int m =s.nextInt();
            ll.addLast(m);
        }

        ll.display();
        System.out.println(ll.palidrome(n));

    }

}
