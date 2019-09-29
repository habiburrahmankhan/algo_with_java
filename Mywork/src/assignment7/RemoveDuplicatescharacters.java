package assignment7;

import java.util.Scanner;

public class RemoveDuplicatescharacters {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        removedup("", str);
    }
    public  static  void  removedup(String processed ,String unprocessed)
    {
        if (unprocessed.isEmpty())
        {
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        unprocessed = unprocessed.substring(1);
        if (!unprocessed.isEmpty()) {
            if (ch == unprocessed.charAt(0)) {
                removedup(processed, unprocessed);
                return;
            }
        }
                removedup(processed+ ch, unprocessed);
        }
}
