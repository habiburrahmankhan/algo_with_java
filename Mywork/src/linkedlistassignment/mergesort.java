package linkedlistassignment;

public class mergesort {
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
    public void insertlast(int item)
    {
        if (head==null)
        {
            insertfirst(item);
            size++;
            return;
        }
        node node =new node(item);
        tail.next=node;
        tail=node;
        size++;
    }
    public node get(int index)
    {
        node temp=head ;
        for (int i = 0; i <index ; i++) {
            temp=temp.next ;
        }
        return temp ;
    }
    public mergesort merrgesort(mergesort list1 ,mergesort list2)
    {
        node first =list1.head;
        node second = list2.head;
        mergesort list3 = new mergesort();
        while (first!=null && second!=null)
        {
            if (first.data < second.data)
            {
                list3.insertlast(first.data);
                first=first.next;
            }
            else
            {
                list3.insertlast(second.data);
                second=second.next;
            }
            size++;
        }
        while (first!=null)
        {
            list3.insertlast(first.data);
            first=first.next;
            size++;
        }
        while (second!=null)
        {
            list3.insertlast(second.data);
            second=second.next;
            size++;
        }
        return list3;
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
