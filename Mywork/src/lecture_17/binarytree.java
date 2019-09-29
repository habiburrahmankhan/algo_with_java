package lecture_17;

import java.util.Scanner;

public class binarytree {

    private  Node root ;
    private class Node
    {
        private Node left ;
        private  Node right ;

        private int value ;


        public Node( int value )
        {
            this.value=value ;

        }

    }


    public void populate(Scanner s)
    {
        this.root = populate(root , s);
    }
    private Node populate (Node node ,Scanner s)
    {
        if (node==null)
        {
            System.out.println("enter the value of root ");
            int value =Integer.parseInt(s.nextLine());
            return  new Node(value) ;
        }
        System.out.println("enter the direction ");
        String dir = s.nextLine();
        if (dir.equals("left"))
        {
            node.left=populate(node.left ,s);
        }
        else
        {
            node.right=populate(node.right ,s);
        }
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
        System.out.println(node.value + s + root1);
        display(node.left , s+"\t" ,"left");
        display(node.right , s+"\t" , "right");
    }
    public int height()
    {
       return  height(root) ;
    }
    private int height(Node node)
    {
        if (node==null)
        {
            return 0 ;
        }
        return 1+Math.max(height(node.left) , height(node.right)) ;
    }
    public int diameter()
    {
        return diameter(root) ;
    }
    private  int diameter(Node node )
    {
        if(node==null)
        {
            return 0;
        }
        int   current= 1 + height(node.left) + height(node.right) ;
        int max = Math.max(diameter(node.left) , diameter(node.right) );
        return  Math.max(max, current) ;
    }

    public boolean find(int element)
    {
        return find(root ,element);
    }
    public boolean find(Node node , int target)
    {
        if (node==null)
        {
            return false ;
        }
        return (node.value==target || find(node.left ,target) || find(node.right , target));
    }

    public void mirror()
    {
        mirror(root);
    }
    private void mirror(Node node)
    {
        if (node==null)
        {
            return;
        }
        Node temp=node.left ;
        node.left=node.right;
        node.right=temp ;
       mirror(node.right);
       mirror(node.left);
    }
}
