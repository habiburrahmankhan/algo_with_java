package lecture_18;

import java.util.Scanner;

public class sortedarraybinarysearchtree {
     private Node root;
    private class Node
    {
        private  int value ;
        private Node left ;
        private Node right ;

        public Node(int value)
        {
            this.value=value;
        }
    }

    public Node populate(int[] arr)
    {
        return this.root=populate(this.root, arr ,0);
    }
    private Node populate(Node node ,int[] arr ,int i)
    {
        System.out.println("Enter the value of node");
        if (node==null)
        {
            return  new Node(arr[arr.length/2 +i]) ;
        }

        node.left=populate(node.left ,arr, i-1);
        node.right=populate(node.right ,arr ,i+1);
       return node ;
    }

    public void display() {
        display(root, "", "root");

    }

    private void display(Node node, String s, String root1) {
        if (node == null) {
            return;
        }
        System.out.println(node.value + s + root1);
        display(node.left, s + "\t", "left");
        display(node.right, s + "\t", "right");
    }
}
