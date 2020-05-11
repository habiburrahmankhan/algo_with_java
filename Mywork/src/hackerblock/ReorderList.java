package hackerblock;


import java.util.*;

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

public class ReorderList {
    Node head; // head of lisl
    Node last; // last of linked list

    /* Linked list Node*/

    /* Utility functions */

    /* Inserts a new Node at front of the list. */
    public void addToTheLast(Node node) {

        if (head == null) {
            head = node;
            last = head;
        } else {
            // Node temp = head;
            // while (temp.next != null) temp = temp.next;

            last.next = node;
            last = last.next;
        }
    }
    /* Function to print linked list */
    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    /* Drier program to test above functions */
    public static void main(String args[]) {

        /* Constructed Linked List is 1->2->3->4->5->6->
           7->8->8->9->null */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            ReorderList llist = new ReorderList();

            int a1 = sc.nextInt();
            Node head = new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++) {
                int a = sc.nextInt();
                llist.addToTheLast(new Node(a));
            }

            llist.head = new gfg().reorderlist(llist.head);

            llist.printList();

            t--;
        }
    }
}// } Driver Code Ends
/* Following is the Linked list node structure */

/*class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}*/

class gfg {
    Node reorderlist(Node head) {
        // Your code here
         ArrayList<Integer>  arr = new ArrayList<>();
         Node temp = head ;
         while (temp!=null)
         {
             arr.add(temp.data) ;
             temp= temp.next ;
         }
        ArrayList<Integer>  arr_ans = new ArrayList<>();
         int i = 0 , j = arr.size() - 1  ;
         while (i <=j )
         {
             arr_ans.add(arr.get(i)) ;
             if(arr.get(i)!=arr.get(j))
             arr_ans.add(arr.get(j)) ;
             i++ ;
             j-- ;

         }
        HashMap<Integer , Integer> aa = new HashMap<>();
       //  aa.get()

        System.out.println(arr_ans);

        i = 1  ;
        Node head1  ;
        Node temp__ = new Node(arr_ans.get(0)) ;
           head1 = temp__ ;
        while (i < arr_ans.size())
        {
            Node  temp_ = new Node(arr_ans.get(i)) ;
             temp__.next = temp_ ;
               temp__ = temp_ ;
            i++ ;
        }
        temp = head1 ;
      return temp ;
    }
}


//38
//        188 62 3 182 161 89 80 21 142 94 125 29 136 109 163 143 71 197 164 67 12 101 116 88 35 133 91 151 94 34 140 81 95 94 14 55 183 45
