package hackerblock;

import java.util.Scanner;

public class canyoureadthis {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        String str = s.next();
        for (int i = 0; i <str.length()-1; i++) {
            System.out.print(str.charAt(i));
            if (Character.isUpperCase(str.charAt(i+1)))
            {
                System.out.println();
            }
        }
        System.out.print(str.charAt(str.length()-1));
    }
}
