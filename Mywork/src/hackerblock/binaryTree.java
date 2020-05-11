package hackerblock;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class binaryTree {
    class Node
    {
        int val ;
        Node left ;
        Node right ;
        public Node(int val )
        {
            this.val = val ;
            this.left = null ;
            this.right = null ;
        }
    }
     private Node root ;
    public void populate(Scanner s )
    {
        this.root = populate(s ,root );
    }
    public  Node populate(Scanner s  , Node node)
    {

        int d =Integer.parseInt(s.nextLine());
        if(d==-1)
        {
            return null ;
        }
        node = new Node(d);
        node.left = populate(s , node.left);
        node.right = populate(s , node.right);

        return  node ;
    }
    public void display()
    {
        display(root ,"" , "root");
    }
    public void display(Node node , String s , String root1)
    {
        if (node==null)
        {
            return;
        }
        System.out.println(node.val + s + root1);
        display(node.left , s+"\t" ,"left");
        display(node.right , s+"\t" , "right");
    }
    public void preOrder()
    {
        preOrder(root);
    }
    public void InOrder()
    {
        InOrder(root);
    }
    public void postOrder()
    {
        postOrder(root);
    }
    public void preOrder(Node node)
    {
        if (node==null)
        {
            return ;
        }
        System.out.print(node.val + "         ");
        preOrder(node.left);
        preOrder(node.right);
    }
    public void InOrder(Node node)
    {
        if (node==null)
        {
            return ;
        }

        InOrder(node.left);
        System.out.print(node.val + "         ");
        InOrder(node.right);
    }
    public void postOrder(Node node)
    {
        if (node==null)
        {
            return ;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.val + "         ");
    }
    public int height()
    {
       return height(root);
    }

    private int height(Node root) {
        if (root==null)
        {
            return 0;
        }
        return Math.max(height(root.left) , height(root.right)) + 1 ;
    }
    public void kthlevel(int k)
    {
        kthlevel(root , k);
    }

    private void kthlevel(Node root, int k) {
       if (root==null)
       {
           return;
       }
       if (k==1)
       {
           System.out.print(root.val + "       ");
           return;
       }
       kthlevel(root.left , k-1);
       kthlevel(root.right, k-1);
       return;
    }
     public void bfs()
     {
         Queue<Node> que = new LinkedList<>();
         que.add(root);
         while (!que.isEmpty())
         {
             Node nd = que.remove();
             System.out.print(nd.val + "          ");
             if (nd.left!=null)
             que.add(nd.left);
             if (nd.right!=null)
             que.add(nd.right);
         }
     }

    public void bfsnextline()
    {
        Queue<Node> que = new LinkedList<>();
        que.add(root);
        que.add(null);
        while (!que.isEmpty())
        {
            Node nd = que.peek();
            if (nd==null)
            {
                System.out.println();
                que.remove();
                if (!que.isEmpty())
                {
                    que.add(null);
                }
            }
            else {
                System.out.print(nd.val + "          ");
                que.remove();
                if (nd.left != null)
                    que.add(nd.left);
                if (nd.right != null)
                    que.add(nd.right);
            }
        }
    }
    public int countnode()
    {
        return countnode(root);
    }

    private int countnode(Node root) {
     if (root==null)
     {
         return 0 ;
     }
     int count = 0 ;
     count = 1 + countnode(root.left) + countnode(root.right);
     return count;
    }
    public int sumallnode()
    {
        return sumallnode(root);
    }

    private int sumallnode(Node root) {
        if (root==null)
        {
            return 0 ;
        }
        int count = 0 ;
        count = root.val + sumallnode(root.left) + sumallnode(root.right);
        return count;
    }
}
