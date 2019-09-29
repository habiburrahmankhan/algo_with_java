package lecture_15;

public class linkedlist {


        private node head ,tail ;
        private int size=0;
        private class node {
            private int data;
            private node next;

            public node(int data) {
                this.data=data ;
            }
        }
        public void insertfirst(int item )
        {
            node node = new node(item);
            node.next=head ;
            head=node ;
            size++ ;
            if (tail==null)
            {
                tail=head ;
            }
        }

        public void insertatlast(int item)
        {
            if (size==0)
            {
                insertfirst(item);
                size++;
                return;
            }
            node node =new node(item);
            tail.next=node ;
            tail=node ;
            size++;

        }
        public int deleteatfirst()
        {
            if (size==0)
            {
                System.out.println("list is empty ");
                return -1;
            }
            int temp=head.data ;
            if (head==tail)
            {
                head=head.next;
                tail=head ;
                return temp ;
            }

            head=head.next ;
            size--;
          return temp ;
        }
        public int deleteatlast()
        {
            if (size<2)
            {
                size--;
                return deleteatfirst();
            }
            node temp=head ;
            while (temp.next!=tail)
            {
                temp=temp.next ;
            }
            int last = tail.data ;
            tail=temp ;
            temp.next=null ;
            size--;
            return last ;
        }
        public node get(int index)
        {
            node temp=head  ;
            for (int i = 0; i <index ; i++) {
                temp=temp.next ;
            }
            return temp ;
        }
        public void insertatposition(int index ,int item )
        {
            if (index==0)
            {
                insertfirst(item);
                return;
            }
            if (index==size)
            {
                insertatlast(item);
                  return;
            }
            node prev = get(index-1) ;
            node Node = new node(item ) ;
            Node.next=prev.next ;
            prev.next=Node ;
            size++;
        }
        public int deleteatanyposition(int index)
        {
            if (size==0)
            {
                return deleteatfirst();
            }
            if (size-1==index)
            {
                deleteatlast() ;
            }
            node prev=get(index-1);
            int item = (prev.next).data ;
            prev.next=(prev.next).next ;
            size--;
            return item ;
        }
        public int midoflinkedlist()
        {
            node slow =head ;
            node fast =head ;
            while (fast.next!=null && fast.next.next!=null)
            {
                slow=slow.next;
                fast=fast.next.next ;
            }
            return slow.data;
        }
        public void callreverse()
        {
            reverse(head);
        }
        private void reverse(node node)
        {
            if (node==tail)
            {
                head=tail ;
                return;
            }
            reverse(node.next);
            tail.next=node;
            tail=node;
            tail.next=null ;
        }


        // mergesort

        public void display()
        {
            node node =head;
           while(node!=null)
           {
               System.out.println(node.data);
               node=node.next ;
           }
            System.out.println("End");
        }

}
