package trees;

import java.util.ArrayList;
import java.util.Scanner;

public class GenericTrees {
    private class Node
    {
        int data ;
        ArrayList<Node>    children ;
        Node(int data)
        {
            this.data=data;
            this.children = new ArrayList<>();
        }
    }
    private Node root ;
    private int size ;
    GenericTrees()
    {
        Scanner s = new Scanner(System.in);
        this.root = takeInput(s,null ,0);
    }

    private Node takeInput(Scanner s ,Node parent ,int ithchild)
    {
        if (parent==null)
        {
            System.out.println("Enter the data of the root ");
        }
        else
        {
            System.out.println("Enter the data of "+ithchild + " of the node   " + parent.data);
        }

        int nodedata=s.nextInt();
        Node node = new Node(nodedata);
        System.out.println("Enter the no of child node of the "+node.data);
        int children = s.nextInt();
        for (int i = 0; i <children ; i++) {
            Node child = takeInput(s,node, i);
            node.children.add(child);
        }
        return node;
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
