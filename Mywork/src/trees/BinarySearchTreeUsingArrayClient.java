package trees;

import java.util.Scanner;

public class BinarySearchTreeUsingArrayClient {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int n = s.nextInt();
        System.out.println("Enter the size of array ");
        int arr[] = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]= s.nextInt();
        }

        BinarySearchTreeusingArray bt = new BinarySearchTreeusingArray(arr);
        bt.display();
        System.out.println("is this no   present in BST " + bt.find(5));
        System.out.println("Max  "  +bt.Max());
        System.out.println("Min  "  +bt.Min());
//        bt.addNode(35);
//        bt.addNode(80);
//        bt.display();
//        bt.remove(35);
//        bt.display();
//        bt.display();
//        bt.remove(70);
//        bt.display();

    }
    }
// 10 20 30 40 50 60 70