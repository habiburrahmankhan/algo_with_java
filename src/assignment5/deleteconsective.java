package assignment5;

import java.util.Scanner;

public class deleteconsective {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        String a =s.next();

        duplicate(a);

    }
    public static void duplicate(String s)
    {
        StringBuilder sb = new StringBuilder();
                int i=0;
                while(i<s.length()-1) {
                    if (s.charAt(i)!=s.charAt(i+1))
                    {
                        sb.append(s.charAt(i));
                    }
                    i++ ;
                }
        System.out.println(sb.toString());
        }

}
