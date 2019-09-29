package assignment5;

import java.util.Scanner;

public class subsequenceofstring {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        String pali =s.next() ;
        Subsequence(pali) ;
    }
    public static void Subsequence(String s )
    {
        String sb;
        for (int i = 0; i <s.length() ; i++) {
            for (int j = i; j <s.length() ; j++) {
                sb=s.substring(i,j+1)   ;
                System.out.print(sb + "    ");
            }
        }
    }
}
