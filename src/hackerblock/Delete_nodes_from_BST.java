package hackerblock;

import java.util.Arrays;
import java.util.Scanner;

public class Delete_nodes_from_BST {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int test=s.nextInt();
        for (int k = 0; k < test; k++) {
            int n  =s.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i <n ; i++) {
                arr[i]=s.nextInt();
            }
            int c  =s.nextInt();
            int a[] = new int[c];

            for (int i = 0; i <c ; i++) {
                a[i]= s.nextInt();
            }
            Delete_nodes_from_BST m = new Delete_nodes_from_BST();
            for (int i = 0; i <n ; i++) {
               m.populate(arr[i]);
            }
            for (int i = 0; i < c; i++) {
                m.remove(a[i]);

            }
           m.preorder();
        }


    }
    private class Node
    {
        int data ;
        Node left ;
        Node right ;
        public Node(int val)
        {
            this.data = val ;
         }
    }
    private Node root ;

    public Node populate(int value)
    {
        return this.root=populate(root ,value);
    }

    public Node populate(Node node ,int value)
    {
        if (node==null)
        {
            return  new Node(value) ;
        }
        else if (node.data > value)
        {
            node.left=populate(node.left,value) ;
        }
        else
        {
            node.right=populate(node.right,value) ;
        }

        return node ;
    }
    public void remove( int val )
    {
        remove(this.root,null , false , val);
    }
    private void remove(Node node , Node parent , boolean ilc , int val) {
         if (node==null)
         {
             return;
         }
        if (node.data > val) {
            remove(node.left, node, true, val);
        } else if (node.data < val) {
            remove(node.right, node, false, val);
        } else {
            if (node.left == null && node.right == null) {
                if (ilc) {
                    parent.left = null;
                } else {
                    parent.right = null;
                }
            } else if (node.left == null && node.right != null) {
                if (ilc) {
                    parent.left = node.right;
                } else {
                    parent.right = node.right;
                }
            } else if (node.left != null && node.right == null) {
                if (ilc) {
                    parent.left = node.left;
                } else {
                    parent.right = node.left;
                }
            } else {
                int max = Max(node.left);
                node.data = max;
                remove(node.left, node, true, max);
            }

        }
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
    private int  Max(Node node) {
         if (node.right==null)
         {
             return node.data ;
         }
        return Max(node.right);
    }
    public void display()
    {
        System.out.println("----------------------");
        display(this.root);
        System.out.println("----------------------");
    }
    private void display(Node node)
    {
        if (node==null)
        {
            return;
        }
        String str="";
        if (node.left!=null)
        {
            str+= node.left.data ;
        }
        str+=" <== "  + node.data +" ==> " ;
        if (node.right!=null)
        {
            str+=node.right.data ;
        }
        System.out.println(str);
        display(node.left);
        display(node.right);
    }
}
