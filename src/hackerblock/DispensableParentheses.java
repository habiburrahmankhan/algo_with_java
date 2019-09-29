package hackerblock;

import java.util.Scanner;
import java.util.Stack;

public class DispensableParentheses {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t =s.nextInt();
        for (int i = 0; i < t; i++) {
            String str = s.next();
            checkduplicate(str);
        }


    }

    private static void checkduplicate(String str) {
        Stack<Character> stackk = new Stack<>();

        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
            if (ch!=')')
            {
                stackk.push(ch);
            }
            else {
                 if (stackk.peek()=='(')
                 {
                     System.out.println("Duplicate");
                     return;
                 }
                while (stackk.peek() != '(') {
                      stackk.pop();
                }
                stackk.pop();
            }

        }
        System.out.println("Not Duplicates");

    }
}
