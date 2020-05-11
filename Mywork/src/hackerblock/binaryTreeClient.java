package hackerblock;

import java.util.Scanner;

public class binaryTreeClient {
    public static void main(String[] args) {
        binaryTree bt = new binaryTree();
        Scanner s = new Scanner(System.in);
        bt.populate(s);
        bt.display();
        System.out.println("preorder");
        bt.preOrder();
        System.out.println("inorder");
        bt.InOrder();
        System.out.println("postorder");
        bt.postOrder();
        System.out.println("height" + bt.height());
        bt.kthlevel(2);
        System.out.println();
        bt.bfs();
        System.out.println();
        bt.bfsnextline();
        System.out.println("count = " + bt.countnode());
        System.out.println("sum = " + bt.sumallnode());
//        binaryTreeTF bttf = new binaryTreeTF();
//        Scanner s = new Scanner(System.in);
//        bttf.populate(s);
//        bttf.display();

    }
}
//8
//10
//1
//-1
//-1
//6
//4
//-1
//-1
//7
//-1
//-1
//3
//-1
//14
//13
//-1
//-1
//-1