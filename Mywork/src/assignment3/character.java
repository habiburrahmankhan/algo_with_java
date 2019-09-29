package assignment3;

import java.util.Scanner;

public class character {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        System.out.println("enter the  ch  ");
        char ch= s.next().charAt(0);

        System.out.println(charac(ch));
    }
    public static char charac(char ch)
    {
        if (ch>='a' && ch<='z')
        {
            return 'L' ;
        }
        else if (ch>='A' && ch<='Z')
        {
            return 'U' ;
        }

        return 'I' ;
    }
}
