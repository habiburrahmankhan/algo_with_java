package trees;
import java.util.*;
public class Replace_with_Sum_of_greater_nodes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n  =s.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i <n ; i++) {
                arr[i]=s.nextInt();
            }
            Replace_with_Sum_of_greater_nodes m = new Replace_with_Sum_of_greater_nodes();
            for (int i = 0; i <n ; i++) {
                m.populate(arr[i]);
            }

            m.preorder();


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


}
