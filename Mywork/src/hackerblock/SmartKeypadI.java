package hackerblock;

import java.util.Scanner;

public class SmartKeypadI {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        String table[] = { " ", ".+@$", "abc", "def", "ghi", "jkl" , "mno", "pqrs" , "tuv", "wxyz" };
        String str =s.next();
        keypad(str ,"" ,table);
    }

    private static void keypad(String unprocessed ,String processed,String[] table ) {
        if (unprocessed.length()==0)
        {
         return;
        }
        int ch = unprocessed.charAt(0) - '0';
            unprocessed=unprocessed.substring(1);
            keypad(unprocessed , processed+ch,table);

        }
    }

