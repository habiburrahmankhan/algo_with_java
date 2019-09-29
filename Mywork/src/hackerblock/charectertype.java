package hackerblock;

import java.util.Scanner;

public class charectertype {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char ch =s.next().charAt(0);
        System.out.println(chartype(ch));
    }
    public static char chartype(char ch)
    {
        if (ch>='a' && ch<='z')
        {
            return 'L';
        }
        else if(ch>='A' && ch<='Z')
        {
          return 'U' ;
        }
        else
        {
            return 'I';
        }
    }
}
