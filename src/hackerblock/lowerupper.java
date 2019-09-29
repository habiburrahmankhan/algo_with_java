package hackerblock;

import java.util.Scanner;

public class lowerupper {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char ch =s.next().charAt(0);
        if (ch>='a' && ch<='z')
        {
            System.out.println("lowercase");
        }
        else if(ch>='A' && ch<='Z')
        {
            System.out.println("UPPERCASE");
        }
        else
        {
            System.out.println("Invalid");
        }
    }
}
