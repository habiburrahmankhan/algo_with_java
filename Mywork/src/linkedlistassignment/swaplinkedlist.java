package linkedlistassignment;

public class swaplinkedlist {
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
    public void swap(int index1 ,int index2)
    {
         int temp ;
         node i=get(index1);
         node j=get(index2) ;
         temp=i.data;
         i.data=j.data;
         j.data=temp;
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
