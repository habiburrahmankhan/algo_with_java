package hackerblock;

import java.util.Scanner;

public class Recursion_Dictionary_Order_Larger {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String str = s.next();
        larger(str,str , "");
    }

    private static void larger(String str , String unprocessed, String processed) {
          if (unprocessed.length()==0)
          {
              if (processed.compareTo(str) > 0)                        // for smaller  if (processed.compareTo(str) < 0)
              {
                  System.out.println(processed);
              }

              return;
          }
        for (int i = 0; i <unprocessed.length(); i++) {
            char ch  =unprocessed.charAt(i);
            String roq=unprocessed.substring(0,i) + unprocessed.substring(i+1);
                larger(str , roq , processed+ ch);
        }
    }
}
