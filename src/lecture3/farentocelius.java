package lecture3;

import java.util.Scanner;

public class farentocelius {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        System.out.println("enter the starting and  end temperature :-  ");
        int start = s.nextInt() ;
        int last = s.nextInt() ;
        converter(start , last) ;
    }
     public static void converter(int start ,int last) {
         int c = 0;
         while (start <= last) {
             c = (int) (5 * (start - 32)) / 9;         // c=(5f/9)*(f-32)
             System.out.println(start + "     " + c);
             start += 20;
         }
     }
}
