package hackerblock;

import java.util.ArrayList;
import java.util.Scanner;

public class Find_sum_at_level_K {
    public static void main(String[] args) {
        Find_sum_at_level_K fm = new Find_sum_at_level_K();
        Scanner s  = new Scanner(System.in);
        fm.display();
        int k  = s.nextInt();
        System.out.println(fm.sum(k));
    }
    private class Node
    {
        int data ;
        ArrayList<Node> children ;
        public Node( int data)
        {
           this.data = data ;
           this.children =new ArrayList<>();
        }
    }

    private Node root ;
    Find_sum_at_level_K()
    {
        Scanner s  = new Scanner(System.in);
        this.root=Find_sum_at_level_K(null  , s);
    }

    private Node Find_sum_at_level_K(Node parent , Scanner s )
    {
      if (parent == null )
      {
          System.out.println("Enter the value of the root ");
      }
      int data = s.nextInt();
      Node node = new Node(data);
      int no_ofchild = s.nextInt();
        for (int i = 0; i < no_ofchild; i++) {
            Node child = Find_sum_at_level_K(node , s);
            node.children.add(child);
        }

      return node;
    }
    public int sum(int k )
    {
        return sum(root , k);
    }
    private int sum(Node node,int k)
    {
        int sumk=0;

        if (k==0)
        {
            return sumk +node.data;
        }

        for (Node child:node.children) {
            sumk+=sum(child ,k-1);
        }

        return sumk;
    }
    public void display()
    {

        display(this.root , "");
    }
    private  void display(Node node , String str )
    {
        System.out.println(str + node.data);
        for (Node child:node.children) {
            display(child , str + "\t");
        }
    }


}
