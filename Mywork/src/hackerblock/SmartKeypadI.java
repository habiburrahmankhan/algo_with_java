package hackerblock;

import java.util.Scanner;

public class SmartKeypadI {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        String table[] = { " ", ".+@$", "abc", "def", "ghi", "jkl" , "mno", "pqrs" , "tuv", "wxyz" };
        String st =  table[0].toString();
        String str =s.next();
        keypad(str ,"" ,table);
    }

    private static void keypad(String unprocessed ,String processed,String[] table ) {
        if (unprocessed.length()==0)
        {
            System.out.println(processed);
         return;
        }
        int ch = unprocessed.charAt(0) - '0';
            unprocessed=unprocessed.substring(1);
        for (int i = 0; i <table[ch].length(); i++) {
            keypad(unprocessed ,  processed+table[ch].charAt(i),table);
        }
        }
    }

