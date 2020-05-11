package codechef;
import java.util.*;
import java.lang.*;
import java.io.*;
public class aaa {


    /* Name of the class has to be "Main" only if the class is public. */
        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner in = new Scanner(System.in);
            StringBuilder sb = new StringBuilder("ffff");
            StringBuilder sb1 = new StringBuilder("ffff");
            System.out.println(sb.equals(sb1));
            if(sb.equals(sb1))
            {
                System.out.println("ghhhhohoh");
            }
//            int t = in.nextInt();
//
//            for (int i = 0; i < t; i++) {
//                int ar[] = new int[6];
//                for (int j = 0; j < 6; j++) {
//                    ar[j] = in.nextInt();
//                }
//                Sort(ar);
//                CheckFair(ar);
//            }
        }

        public static void Sort(int[] ar) {
            for (int i = 3; i < 5; i++) {
                for (int j = 0; j < 3 - i-1; j++) {
                    if (ar[j] >= ar[j + 1]) {
                        swap(ar, j, j + 1);
                        swap(ar, j + 3, j + 1 + 3);
                    }
                }
            }
        }

        public static void swap(int[] ar, int i, int j) {
            int temp = ar[i];
            ar[i] = ar[j];
            ar[j] = temp;



        }

        public static void CheckFair(int[] ar) {
            for (int i = 1; i < 3; i++) {
                if (ar[i]-ar[i+1]!=0 && ar[i-3]==ar[i+1-3]) {
                    System.out.println("NOT FAIR");
                    return;
                }
                if(ar[i]-ar[i+1]>0 && ar[i-3]!=ar[i+1-3]){
                    System.out.println("NOT FAIR");
                    return;
                }
            }
            System.out.println("FAIR");
        }
    }

