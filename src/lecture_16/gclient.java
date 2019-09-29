package lecture_16;

import java.util.Scanner;

public class gclient {
    public static void main(String[] args) {
        Scanner s = new Scanner("1 true 2 true 3 false true 4 true 5 false false false  true 6 true 7 false false false ") ;
        Generictrees gt = new Generictrees();
        gt.populate(s);
        System.out.println("inorder traversal :- ");
        gt.display();
        System.out.println("post  traversal :- ");
        gt.postorder();

        System.out.println( " total no of node "+ gt.count());
    }
}
