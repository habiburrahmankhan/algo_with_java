package trees;

import java.util.Scanner;

public class Build_BST_sungArray {
    public static void main(String[] args) {
        Build_BST_sungArray bt = new Build_BST_sungArray();
        Scanner s  =new Scanner(System.in);
        int test  =s.nextInt();
        for (int i = 0; i <test ; i++) {
            int m = s.nextInt();
            int arr[] = new int[m];
            for (int j = 0; j < m; j++) {
                arr[j] = s.nextInt();
            }
            bt.takeinput(arr);
            bt.preorder();
            System.out.println(" ");
        }

    }
    public class Node
    {
        int data ;
        Node left ;
        Node right ;
       public Node(int data)
        {
            this.data = data ;
            this.left=null;
            this.right = null ;
        }
    }
    private  Node root;
    public void takeinput( int [] arr)
    {

            this.root=takeinput(null , arr,0,arr.length-1 );
    }
    private Node takeinput(Node parent, int arr[],int lo ,int hi)
    {
        if (lo>  hi)
        {
            return null ;
        }
        int mid=(lo + hi)/2 ;
        Node node = new Node(arr[mid]);
        node.left =takeinput(node , arr , lo , mid -1);
        node.right = takeinput(node , arr , mid+1 , hi);
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
        System.out.print( node.data +" ");
       preorder(node.left);
       preorder(node.right);
    }



}
