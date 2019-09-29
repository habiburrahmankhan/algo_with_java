package lecture_18;

import java.util.Scanner;

public class binarySearchTree {
    public Node root;
    private class Node
    {
         private  int value;
         private  Node left ;
         private  Node right ;
         public Node(int value)
         {
             this.value=value;
         }
    }

    public Node populate(int value)
    {
        return this.root=populate(root ,value);
    }

    public Node populate(Node node ,int value)
    {
        System.out.println("Enter the value of node");
        if (node==null)
        {
            return  new Node(value) ;
        }
        else if (node.value > value)
        {
            node.left=populate(node.left,value) ;
        }
        else
        {
            node.right=populate(node.right,value) ;
        }

         return node ;
    }

    public void display()
    {
        display(root,"" ,"root");

    }
    private void display(Node node ,String s , String root1)
    {
        if (node==null)
        {
            return;
        }
        System.out.println(node.value + s + root1);
        display(node.left , s+"\t" ,"left");
        display(node.right , s+"\t" , "right");
    }

    public boolean find(int value)
    {
        return find(root,value) ;
    }
//    private boolean find(Node node ,int value)
//    {
//        if (node==null)
//        {
//            return false ;
//        }
//        return (node.value==value|| find(node.left ,value) || find(node.right , value));
//
//    }

    private boolean find(Node node ,int value)
    {
        if (node==null)
        {
            return false ;
        }
        else if(node.value==value)
        {
            return true ;
        }
        else if(node.value > value)
        {
            return  find(node.left ,value) ;
        }
        else if(node.value < value)
        {
            return find(node.right , value) ;
        }

        return false ;

    }

    public Node findNode(int value)
    {
        return findNode(root,value) ;
    }


    private Node findNode(Node node ,int value)
    {
        if (node==null)
        {
            return null;
        }
        else if(node.value==value)
        {
            return node ;
        }
        else if(node.value > value)
        {
            return  findNode(node.left ,value) ;
        }
        else if(node.value < value)
        {
            return findNode(node.right , value) ;
        }

        return node ;
    }

//    public int succeser(int value)
//    {
//        return succeser(findNode(value) , value).value;
//    }
//    private Node succeser(Node node , int value)
//    {
//        if (node==null)
//        {
//            return null ;
//        }
//        if (node.right!=null)
//        {
//            Node  current =node.right;
//            while (current.left!=null)
//            {
//                current=current.left;
//            }
//            return current ;
//        }
//            Node t=root;
//            Node prev=null;
//
//            while (t.value!=value)
//            {
//
//                 prev=t;
//                if (t.left.value > value )
//                {
//                    t = t.left;
//                }
//                else
//                    {
//                    t = t.right;
//                    }
//
//
//            }
//            return prev;
//    }
//    private void inrange(Node node ,int start , int end)
//    {
//        if (node==null)
//        {
//            return;
//        }
//        if (node.value)
//    }


}
