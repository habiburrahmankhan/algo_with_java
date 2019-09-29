package lecture_5;

import java.util.Arrays;
import java.util.Scanner;

public class twodarray_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        int ar[][] = new int[3][] ;
        for (int i = 0; i <ar.length ; i++) {
            ar[i]= new int[3] ;
            for (int j = 0; j <ar[i].length ; j++) {
                ar[i][j]=s.nextInt();
            }
        }

        for (int i = 0; i <ar.length ; i++) {
            for (int j = 0; j <ar[i].length ; j++) {
                System.out.print(ar[i][j] + "  ");
            }
            System.out.println();
        }

    }
}
