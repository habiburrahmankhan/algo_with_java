package lecture3;

import java.util.Scanner;

public class celciustofarenhide {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        System.out.println("enter the starting and  end temperature :-  ");
        int f = s.nextInt() ;
        int last = s.nextInt() ;
        int c=0 ;
        while(f<=last)
        {
           c =(int)(5 * (f - 32)) / 9;         // c=(5f/9)*(f-32)
            System.out.println(f + "     "  + c);
            f+=20 ;
        }

    }
}
