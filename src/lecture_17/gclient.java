package lecture_17;

//import lecture_16.Generictrees;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class gclient {
    public static void main(String[] args) throws FileNotFoundException {
//        Scanner s = new Scanner("1 true 2 true 3 false true 4 true 5 false false false  true 6 true 7 false false false ") ;
//        Generictrees gt = new Generictrees();
//        gt.populate(s);
//        System.out.println("inorder traversal :- ");
//        gt.display();
//        System.out.println("post  traversal :- ");
//        gt.postorder();
//
//        System.out.println( " total no of node "+ gt.count());
//        System.out.println(" level order ");
//        gt.levelorder();
//
        binarytree bt = new binarytree();
        File file = new File("input") ;
        Scanner s = new Scanner(System.in) ;

            bt.populate(s);


            bt.display();

//        System.out.println(bt.height());
//        System.out.println(bt.find(13));
//          bt.mirror();
//          bt.display();





    }
}
