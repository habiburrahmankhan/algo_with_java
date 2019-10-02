package trees;

import java.util.*;

public class BinarytreeUsingLevelOrder {
    private class Node
    {
        int data ;
        Node left=null ;
        Node right = null ;
        public Node(int d)
        {
            data= d ;
        }
    }
    private Node root ;

    public void takeInput( )
    {
        Queue<Node> queue = new LinkedList<>();
        Scanner s =new Scanner(System.in);
        this.root = takeInput(queue, s);
    }

    private Node takeInput(Queue<Node> queue , Scanner s)
    {
        int c  =s.nextInt();
        Node n = new Node(c);
       queue.add(n);
       while (!queue.isEmpty())
       {
           Node rv  =queue.remove();
           int c1 ,c2 ;
           c1 =s.nextInt();
           c2 = s.nextInt();
           if (c1!=-1)
           {
               rv.left = new Node(c1);
               queue.add(rv.left);
           }
           if (c2!=-1)
           {
               rv.right = new Node(c2);
               queue.add(rv.right);
           }
       }
       return n ;
    }


    public void Tree_Right_View()
    {
        int max[] = new int[1] ;
        max[0]= -1 ;
        Tree_Right_View(this.root , 0 , max);
    }

    private void Tree_Right_View(Node node , int level , int[] max ) {
        if (node==null)
        {
            return;
        }
        if (level  > max[0])
        {
            System.out.print(node.data + " ");
            max[0] = level ;
        }

        Tree_Right_View(node.right , level + 1 , max);
        Tree_Right_View(node.left , level + 1 , max);
    }
    public void Tree_Left_View()
    {
        int max[] = new int[1] ;
        max[0]= -1 ;
        Tree_Left_View(this.root , 0 , max);

    }

    private void Tree_Left_View(Node node , int level , int[] max ) {
        if (node==null)
        {
            return;
        }
        if (level  > max[0])
        {
            System.out.print(node.data + " ");
            max[0] = level ;
        }

        Tree_Left_View(node.left , level + 1 , max);
        Tree_Left_View(node.right , level + 1 , max);
    }
    public void Top_View()
    {

        HashMap<Integer , Queue<Node>> hmap = new HashMap<>();
        int minmax[] = new int[2];
        Top_View(this.root , 0 ,hmap ,minmax);
         System.out.println();
//        for (Queue<Node> nd:hmap.values()) {
//            for (Node no:nd) {
//                System.out.print( no.data + "   ");
//            }
//            System.out.println();
//        }
//        System.out.println( minmax[0] +  "   " + minmax[1]);
        for (int i =minmax[0] +1; i <minmax[1] ; i++) {
            if (hmap.containsKey(i))
            {
                Queue<Node> nd = hmap.get(i);
                System.out.print(nd.remove().data +  " ");
            }

        }
        System.out.println();

    }

    private void Top_View(Node node, int level, HashMap<Integer, Queue<Node>> hmap , int[] minmax) {
        if (node==null)
        {
            if (minmax[1] < level)
            {
                minmax[1] = level ;
            }
            if (minmax[0] > level)
            {
                minmax[0] = level ;
            }
            return;
        }

        if (hmap.containsKey(level))
        {
             Queue<Node> nd = hmap.get(level);
             nd.add(node);
            hmap.put(level ,nd);
        }
        else
        {
            Queue<Node> queue = new LinkedList<>();
            queue.add(node);
            hmap.put(level ,queue);
        }


        Top_View(node.left , level -1 , hmap ,minmax);
        Top_View(node.right , level + 1 , hmap ,minmax);
    }
    public void Bottom_View()
    {

        HashMap<Integer , Queue<Node>> hmap = new HashMap<>();
        int minmax[] = new int[2];
        Top_View(this.root , 0 ,hmap ,minmax);
        System.out.println();
//        for (Queue<Node> nd:hmap.values()) {
//            for (Node no:nd) {
//                System.out.print( no.data + "   ");
//            }
//            System.out.println();
//        }
//        System.out.println( minmax[0] +  "   " + minmax[1]);
        for (int i =minmax[0] +1; i <minmax[1] ; i++) {
            if (hmap.containsKey(i))
            {
                Queue<Node> nd = hmap.get(i);
                System.out.print(nd.peek() +  " ");
            }

        }
        System.out.println();

    }

    private void Bottom_View(Node node, int level, HashMap<Integer, Queue<Node>> hmap , int[] minmax) {
        if (node==null)
        {
            if (minmax[1] < level)
            {
                minmax[1] = level ;
            }
            if (minmax[0] > level)
            {
                minmax[0] = level ;
            }
            return;
        }

        if (hmap.containsKey(level))
        {
            Queue<Node> nd = hmap.get(level);
            nd.add(node);
            hmap.put(level ,nd);
        }
        else
        {
            Queue<Node> queue = new LinkedList<>();
            queue.add(node);
            hmap.put(level ,queue);
        }


        Bottom_View(node.left , level -1 , hmap ,minmax);
        Bottom_View(node.right , level + 1 , hmap ,minmax);
    }
//    public void Bottom_View()
//    {
//
//        HashMap<Integer , Stack<Node>> hmap = new HashMap<>();
//        int minmax[] = new int[2];
//        Bottom_View(this.root , 0 ,hmap ,minmax);
//        System.out.println();
//        for (Stack<Node> nd:hmap.values()) {
//            for (Node no:nd) {
//                System.out.print( no.data + "   ");
//            }
//            System.out.println();
//        }
//        System.out.println( minmax[0] +  "   " + minmax[1]);
//        for (int i =minmax[0] +1; i <minmax[1] ; i++) {
//            if (hmap.containsKey(i))
//            {
//                Stack<Node> nd = hmap.get(i);
//                System.out.print(nd.pop().data +  " ");
//            }
//
//        }
//        System.out.println();
//
//    }
//
//    private void Bottom_View(Node node, int level, HashMap<Integer, Stack<Node>> hmap , int[] minmax) {
//        if (node==null)
//        {
//            if (minmax[1] < level)
//            {
//                minmax[1] = level ;
//            }
//            if (minmax[0] > level)
//            {
//                minmax[0] = level ;
//            }
//            return;
//        }
//
//        if (hmap.containsKey(level))
//        {
//            Stack<Node> nd = hmap.get(level);
//            nd.add(node);
//            hmap.put(level ,nd);
//        }
//        else
//        {
//            Stack<Node> stack = new Stack<>();
//            stack.push(node);
//            hmap.put(level ,stack);
//        }
//
//
//        Bottom_View(node.left , level -1 , hmap ,minmax);
//        Bottom_View(node.right , level + 1 , hmap ,minmax);
//    }

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


//    public  void RightView() {
//
//        int[] maxLevel = new int[1];
//        maxLevel[0] = -1;
//        dfs(root, 0, maxLevel);
//
//    }
//
//    public  void dfs(Node root, int level, int[] maxLevel) {
//
//        if (root == null) {
//            return;
//        }
//
//
//        if(level > maxLevel[0]){
//            System.out.print(root.data+" ");
//            maxLevel[0] = level;
//        }
//
//        dfs(root.right, level + 1, maxLevel);
//        dfs(root.left, level + 1, maxLevel);
//    }


