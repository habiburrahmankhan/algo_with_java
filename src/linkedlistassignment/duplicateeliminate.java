package linkedlistassignment;

public class duplicateeliminate {
    private node head , tail ;
    private  int size=0;
    private class node
    {
        private   int data ;
        private node next ;
        public node(int item)
        {
            this.data=item ;
        }
    }

    public void insertfirst(int item)
    {

        node node =new node(item);
        node.next=head;
        head=node ;
        size++ ;
        if (tail==null)
        {
            tail=head ;
        }


    }
    public node get(int index)
    {
        node temp=head ;
        for (int i = 0; i <index ; i++) {
            temp=temp.next ;
        }
        return temp ;
    }
    public void duplicate()
    {
        node node=head ;
        while (node.next!=null)
        {
            if (node.data==node.next.data)
            {
                node.next=node.next.next;
            }
            else
            {
                node=node.next;
            }


        }
    }


    public void display()
    {
        node node=head;
        while (node!=null)
        {
            System.out.println(node.data);
            node=node.next;
        }
    }

}
