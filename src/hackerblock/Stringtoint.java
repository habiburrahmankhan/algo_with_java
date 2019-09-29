package hackerblock;

import java.util.Scanner;

public class Stringtoint {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        System.out.println(integers(str , str.length() ,  0)) ;
    }
    public  static  int integers(String str , int n , int inte )
    {
        if (str.isEmpty())
        {
            return inte ;
        }
        int ch=str.charAt(n-1) - '0';
        str = str.substring(0 , n-1);

        return integers(str , n-1 , inte + ch*10) ;


    }
}
