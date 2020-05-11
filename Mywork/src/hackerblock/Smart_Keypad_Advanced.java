package hackerblock;

import java.util.Scanner;

public class Smart_Keypad_Advanced {
    public static void main(String[] args) {
        Scanner s  =new Scanner(System.in);
        String table[] = { " ", ".+@$", "abc", "def", "ghi", "jkl" , "mno", "pqrs" , "tuv", "wxyz" };
        String searchIn [] = {
                "prateek", "sneha", "deepak", "arnav", "shikha", "palak",
                "utkarsh", "divyam", "vidhi", "sparsh", "akku"
        };
        String str =s.next();
        keypad(str ,"" ,table,searchIn);
    }

    private static void keypad(String unprocessed ,String processed,String[] table ,String[] searchIn) {
        if (unprocessed.length()==0)
        {
           // System.out.println(processed);
            for (int i = 0; i <searchIn.length ; i++) {
                if(searchIn[i].contains(processed))
                {
                    System.out.println(searchIn[i]);
                }
            }
            return;
        }
        int ch = unprocessed.charAt(0) - '0';
        unprocessed=unprocessed.substring(1);
        for (int i = 0; i <table[ch].length(); i++) {
            keypad(unprocessed ,  processed+table[ch].charAt(i),table , searchIn);
        }
    }
}