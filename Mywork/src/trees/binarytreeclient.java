package trees;


public class binarytreeclient {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.display();
        System.out.println("height of tree "  + bt.height());
        bt.preorder();
        System.out.println("pre order");
        bt.postorder();
        System.out.println("post order");
        bt.inorder();
        System.out.println("inorder");
        System.out.println("level order   ");
        bt.levelOrder();
        System.out.println("is BST ");
        System.out.println(bt.isBSTarray());
        System.out.println(bt.isBST());
        System.out.println(bt.searchnode(95));

    }
}


















// 50 true 25 true 38 false false true 48 true 18 false false false true 45 true 85 false false true 60 false false
// 10 true 20 true 40 false false true 50 false false true 30 true 60 false false true 73 false false