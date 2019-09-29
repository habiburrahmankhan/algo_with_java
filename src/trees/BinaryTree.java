package trees;

import java.util.*;

public class BinaryTree {
    private class Node {
        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right) {
            this.data=data;
            this.left=left;
            this.right=right;
        }
    }
    private Node root ;
    private int size ;

    public BinaryTree()
    {
        Scanner s = new Scanner(System.in);
        this.root = takeInput(s,root ,false);
    }
    private Node takeInput(Scanner s ,Node parent ,boolean isleftorright)
    {
        if (parent==null)
      {
          System.out.println("Enter the value of root ");

      }
      else
      {
          if (isleftorright) {
              System.out.println("enter the value of  left child of " + parent.data);
          }
          else
          {
              System.out.println("enter the value of  right child of " + parent.data);
          }
      }
     
       int data = s.nextInt();
      Node node = new Node(data , null ,null) ;
           boolean choice=false ;
        System.out.println("Do u want left child " + node.data);
           choice =s.nextBoolean();
        if (choice)
        {
             node.left = takeInput(s,node ,true);
        }
        choice=false ;
        System.out.println("Do u want right child " + node.data);
        choice =s.nextBoolean();
        if (choice)
        {
            node.right = takeInput(s ,node,false);
        }
        return node ;
    }
    public void display()
    {
        display(this.root);
    }
    private void display(Node node )
    {
        if (node==null)
        {
            return;
        }
        if (node.left!=null)
        {
            System.out.print(node.left.data );
        }

        System.out.print( " <== "  +  node.data +" ==> ");
        if (node.right!=null)
        {
            System.out.print( node.right.data);
        }
        System.out.println();
        display(node.left);
        display(node.right);
    }
    public int height()
    {
        return this.height(this.root);
    }
    private int height(Node node)
    {
        if (node==null)
        {
            return 0;
        }
        int lheight=height(node.left);
        int rheight = height(node.right);
        int height = Math.max(lheight , rheight) + 1  ;
        return height ;
    }
    public void preorder()
    {
        preorder(this.root);
    }
    private void preorder(Node node)
    {
        if (node==null)
        {
            return;

        }
        System.out.print(node.data + "      ");

        preorder(node.left);
        preorder(node.right);
    }
    public void postorder()
    {
        postorder(this.root);
    }
    private void postorder(Node node)
    {

        if (node==null)
        {
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + "      ");
    }
    public void inorder()
    {
        inorder(this.root);
    }
    private void inorder(Node node)
    {

        if (node==null)
        {
          return;
        }
        inorder(node.left);
        System.out.print(node.data + "      ");
            inorder(node.right);

    }
    public void levelOrder()
    {
        Queue<Node> queue = new LinkedList<>();
        queue.add(this.root);
        while (!queue.isEmpty())
        {
            Node rv = queue.remove();
            System.out.print(rv.data + "   ");
            if(rv.left!=null)
            {
                queue.add(rv.left);
            }
            if (rv.right!=null)
            {
                queue.add(rv.right);
            }
        }
        System.out.println();
    }
    public boolean isBST()
    {
        return isBST(this.root , Integer.MIN_VALUE ,Integer.MIN_VALUE) ;
    }
    private boolean isBST(Node node , int min , int max )
    {
        if (node==null)
        {
            return  true ;
        }
        if (node.data < min || node.data > max)
        {
            return false ;
        }
        else if (isBST(node.left , min , node.data))
        {
            return  false ;

        }
        else if(isBST(node.right ,node.data , max))
        {
            return false ;
        }
        return  true ;
    }

    public boolean isBSTarray()
    {
        return isBSTarray(this.root);
    }
    private ArrayList<Integer> order(Node node , ArrayList arr)
    {
        if (node==null)
        {
            return arr;
        }
        order(node.left ,arr);
        arr.add(node.data);
        order(node.right , arr);

        return arr ;
    }
    private  boolean isBSTarray(Node node)
    {
        ArrayList<Integer> arr = new ArrayList<>();


       arr =  order(node , arr);

        for (int i = 0; i <arr.size()-1; i++) {
            if (arr.get(i) > arr.get(i+1))
            {
                return false ;
            }
        }
        return true ;
    }
    public boolean searchnode(int val )
    {
        return searchnode(this.root , val) ;
    }
    private boolean searchnode(Node node ,int val )
    {
        if (node==null)
        {
            return true ;
        }
        return node.data==val || searchnode(node.left ,val ) || searchnode(node , val);
    }
}



