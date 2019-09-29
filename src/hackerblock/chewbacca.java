package hackerblock;

import java.util.Scanner;

public class chewbacca {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n=s.nextInt();
        String str = Integer.toString(n);
        chewbaca(str);
    }
    public static void chewbaca(String str)
    {
        int n=0;
        String sr="";
        while(n<str.length())
        {
            char ch=str.charAt(n);
            int m=Integer.parseInt(String.valueOf(ch));
              if (m > 4) {
                  m= (9 - m);
              }
              sr+=m;
            n++;
        }

        System.out.println(sr);

    }
}
