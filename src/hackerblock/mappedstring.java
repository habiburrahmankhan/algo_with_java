package hackerblock;

import java.util.Scanner;

public class mappedstring {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        String  str = s.next();
        for (int i = 0; i <str.length(); i++) {
            for (int j =i+1 ; j <=str.length() ; j++) {
                String strr = str.substring(i,j);
                System.out.print(strr + "      ");
            }
            System.out.println();
        }
    }
}
