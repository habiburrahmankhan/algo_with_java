package hackerblock;

public class linkedlist {
    private class Node
    {
        int data ;
        Node next ;
    }
    private Node head ;
    private Node tail ;
    private int size ;



    public void display()
    {
        Node temp = head ;
        while(temp!=null)
        {
            System.out.print(temp.data + " ->   ");
            temp = temp.next;

        }
        System.out.println("END");
    }
    public void addlast( int data)
    {
        Node node =new Node();
        node.data = data;
        node.next =null;
        if(size==0)
        {
            head = node;
            tail= node ;
            size++;
        }
        else
        {
            tail.next=node;
            tail=node;
            size++;
        }
    }
    public void addfirst(int data)
    {
        Node node = new Node();
        node.data = data ;
        node.next=null;
        if(size==0)
        {
            head=node;
            tail=node;
            size++;
        }
        else
        {
            node.next=head;
            head=node;
            size++;
        }
    }
    public int getfirst() throws  Exception
    {
        if (size==0)
        {
            throw new Exception("LLinked list is Empty ");
        }
        return head.data ;
    }
    public int getLast() throws  Exception
    {
        if (size==0)
        {
            throw new Exception("LLinked list is Empty ");
        }
        return tail.data ;
    }
    public int getat(int n) throws Exception
    {
        Node temp =head;
        if (size==0)
        {
            throw new Exception("LLinked list is Empty. ");
        }
        if(n < 0 || n >=size)
        {
            throw new Exception("Invalid index. ");
        }
        for (int i = 1; i <n ; i++) {
            temp=temp.next;
        }
        return temp.data ;

    }
    private Node getNodeat(int n) throws Exception
    {
        Node temp =head;
        if (size==0)
        {
            throw new Exception("LLinked list is Empty. ");
        }
        if(n < 0 || n >=size)
        {
            throw new Exception("Invalid index. ");
        }
        for (int i = 0; i <n ; i++) {
            temp=temp.next;
        }
        return temp ;

    }
    public void addat(int n,int data) throws Exception
    {


        if (size==0)
        {
            throw new Exception("LLinked list is Empty. ");
        }
        if(n < 0 || n >size)
        {
            throw new Exception("Invalid index. ");
        }
        if (n==0)
        {
            addfirst(data);
        }
        else if(n==size)
        {
            addlast(data);
        }
        else
        {
            Node node = new Node();
            node.data=data;
            node.next=null;
            Node temp =getNodeat(n-1);
            node.next=temp.next;
            temp.next=node;
        }

    }
    public int removefirst() throws Exception
    {
        if (size==0)
        {
            throw new  Exception("LL is Empty ");
        }
        Node temp =  head ;
        if (size==1)
        {
            head=null;
            tail=null;
            size=0;
        }
        else
        {
            head=head.next;
            size--;
        }
        return temp.data;
    }
    public int removeLast() throws Exception
    {
        if (size==0)
        {
            throw new  Exception("LL is Empty ");
        }
        Node temp = tail;
        if (size==1)
        {
            head=null;
            tail=null;
            size=0;
        }
        else
        {
            Node ln=getNodeat(size-2);
            tail=ln;
            ln.next=null;
            size--;
        }
        return temp.data;
    }
    public  int removeAt(int n ) throws Exception
    {
        if (n<0 || n>size)
        {
            throw new Exception("Invalid  index ") ;
        }
        int data ;
        if (n==0)
        {
           return removefirst();
        }
        else if (size-1==n)
        {
           return removeLast();
        }
        else
        {
             Node temp = getNodeat(n-1);
             data = temp.next.data;
             temp.next=temp.next.next;
            return data;
        }

    }
//    public  void reverseData() throws Exception {
//        int left = 0;
//        int right = size - 1;
//        while (left < right) {
//            Node lf=getNodeat(left);
//            Node rt = getNodeat(right);
//            int temp =lf.data;
//            lf.data=rt.data;
//            rt.data=temp;
//            left++;
//            right--;
//        }
//    }


}
