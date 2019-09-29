package trees;

public class BinarySearchTreeusingArray {
    private class Node
    {
        int data ;
        Node left ;
        Node right ;
    }
    private Node root ;

    BinarySearchTreeusingArray(int[] arr)
    {
        this.root=construct( arr , 0 ,arr.length-1);
    }
    private Node construct(int[] arr ,int lo ,int hi )
    {
        if (lo>  hi)
        {
            return null ;
        }
        int mid= (lo+hi)/2;
        Node nn= new Node();
        nn.data=arr[mid];
        nn.left=construct(arr , lo , mid-1);
        nn.right = construct(arr, mid+1,hi );
        return nn;
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
    public boolean find(int val )
    {
        return  find(this.root,val);
    }
    private boolean find(Node node , int val )
    {
        if (node==null)
        {
            return false ;
        }
        if (node.data==val)
        {
            return true;
        }
        else if(node.data > val)
        {
            return find(node.left , val);
        }
        else
        {
            return find(node.right , val);
        }
    }
    public int Max()
    {
         int max  = Max(this.root);
         return max ;
    }
    private int Max(Node node)
    {
        if (node.right==null)
        {
            return node.data;
        }
        return Max(node.right);
    }
    public int Min()
    {
        int min  = Min(this.root);
        return min ;
    }
    private int Min(Node node)
    {
        if (node.left==null)
        {
            return node.data;
        }
        return Min(node.left);
    }
    public  void addNode(int data)
    {
        addNode(this.root , data);
    }
    private void addNode(Node node ,int data)
    {
        if (node.left==null && node.data > data )
        {
            Node node1 = new Node();
            node1.data=data;
            node1.right=null;
            node1.left=null;
            node.left=node1;
            return;
        }
        if (node.right==null && node.data < data)
        {
            Node node1 = new Node();
            node1.data=data;
            node1.right=null;
            node1.left=null;
            node.right=node1;
            return;
        }
        if (node.data > data)
        {
            addNode(node.left ,data);
        }
        else
        {
            addNode(node.right , data);
        }
    }
    public void remove( int val )
    {
        remove(this.root,null , false , val);
    }
    private void remove(Node node , Node parent , boolean ilc , int val)
    {
        if (node==null)
        {
            return;
        }
        if (node.data > val)
        {
            remove(node.left , node , true , val );
        }
        else if (node.data < val)
        {
            remove(node.right , node , false,val);
        }
        else
        {
            if (node.left==null && node.right==null)
            {
                if (ilc)
                {
                    parent.left=null;
                }
                else
                {
                    parent.right=null;
                }
            }
            else if(node.left==null && node.right!=null)
            {
                if (ilc)
                {
                    parent.left=node.right ;
                }
                else
                {
                    parent.right=node.right;
                }
            }
            else if(node.left!=null && node.right==null)
            {
                if (ilc)
                {
                    parent.left=node.left ;
                }
                else
                {
                    parent.right=node.left;
                }
            }
            else
            {
                int max = Max(node.left);
                node.data=max ;
                remove(node.left , node , true , max);
            }

        }
    }
}
