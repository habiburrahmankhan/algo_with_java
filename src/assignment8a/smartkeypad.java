package assignment8a;

import java.util.Arrays;
import java.util.Scanner;

public class smartkeypad {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String keypad[] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        String spell[]=new String[10] ;
        String digit=s.next();
        keypadd(keypad, digit, 0, 0, spell ,"");
        System.out.println(Arrays.toString(spell));


    }

    public static void keypadd(String keypad[], String digit,int m , int j, String spell[] ,String processed) {
        if (digit.isEmpty())
        {
            spell[m]=processed ;
            m++ ;
            return;
        }

        char ch = digit.charAt(0);
        digit = digit.substring(1);
        int num = ch - '0';
        for (int k = 0; k < keypad[num].length(); k++) {

            keypadd(keypad, digit, m, j + 1, spell ,processed+keypad[num].charAt(k)) ;
        }
    }
}