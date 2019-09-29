package hackerblock;

import trees.BinarytreeUsingLevelOrder;

public class BinarytreeUsingLevelOrderclient {
    public static void main(String[] args) {
        BinarytreeUsingLevelOrder bt = new BinarytreeUsingLevelOrder();
        bt.takeInput();
        bt.display();
        bt.Tree_Right_View();
        System.out.println();
        bt.Tree_Left_View();
        System.out.println();
        bt.Top_View();
        System.out.println();
        bt.Bottom_View();

    }
}



//  1 2 3 4 5 -1 6 -1 -1 -1 -1 -1 -1