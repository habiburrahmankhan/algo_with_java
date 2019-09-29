package lecture_18;

import java.util.Scanner;

public class bstclient {
    public static void main(String[] args) {
//        binarySearchTree bst = new binarySearchTree();
//        Scanner s = new Scanner(System.in);
//       bst.populate(10);
//        bst.populate(9);
//        bst.populate(12);
//        bst.populate(13);
//        bst.populate(11);
//        bst.populate(8);
//        bst.populate(14);
//        bst.display();
       // System.out.println(bst.find(78));

      //  System.out.println(bst.findNode(56));

       // System.out.println(bst.findNode(12));
      //  System.out.println(bst.findNode(56));
     //   System.out.println(bst.succeser(13));
     //   System.out.println(bst.succeser(14));
//        genericbinarysearchtree<Integer> gbst = new genericbinarysearchtree();
//        gbst.populate(100);
//        gbst.populate(112);
//        gbst.populate(140);
//        gbst.populate(110);
//
//        gbst.display();



        sortedarraybinarysearchtree sbst = new sortedarraybinarysearchtree();
        int arr[]={10,11,12,13,14,15,16};
        sbst.populate(arr);
        sbst.display();
    }
}
