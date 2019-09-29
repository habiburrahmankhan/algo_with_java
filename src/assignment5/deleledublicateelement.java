package assignment5;

import java.util.Scanner;

public interface deleledublicateelement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        String a =s.next();

        duplicate(a);

    }
    public static void duplicate(String s)
    {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <s.length() ; i++) {
            int count=0;
            for (int j = 0; j <s.length() ; j++) {
                if(s.charAt(i)==s.charAt(j))
                {
                    count =j;
                    break;
                }
            }
            if (count==i)
            {
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
}
