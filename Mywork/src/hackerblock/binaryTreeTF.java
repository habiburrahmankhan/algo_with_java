package hackerblock;

import java.util.Scanner;

public class binaryTreeTF {
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

        System.out.println("enter the value of root ");
        this.root = populate(root , s);

    }
    private Node populate (Node node ,Scanner s)
    {
        System.out.println("Do u want to add  ");
        boolean dir = Boolean.parseBoolean(s.nextLine());
        if (!dir)
        {
            return  null ;
        }

        int value =Integer.parseInt(s.nextLine());
            System.out.println("Enter L to traverse to the left");
            Node node1 = new Node(value);
            node1.left=populate(node1.left ,s);
            node1.right=populate(node1.right ,s);

        return  node1 ;
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
}
