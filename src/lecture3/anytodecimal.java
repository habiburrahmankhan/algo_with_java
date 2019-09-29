package lecture3;

import java.util.Scanner;

public class anytodecimal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int any =s.nextInt() ;
        int base = s.nextInt() ;
        int deci =anytodeci(any ,base) ;
        System.out.println(deci);
    }
    public static int anytodeci(int any ,int base)
    {
        int place=1 ,deci=0 ;
        while(any>0)
        {
            deci=deci + (any%10)*place ;
            place*=base ;
            any/=10 ;
        }

        return deci ;
    }


}