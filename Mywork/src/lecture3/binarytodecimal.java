package lecture3;

import java.util.Scanner;

public class binarytodecimal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int bin =s.nextInt() ;
        int deci =bintodeci(bin) ;
        System.out.println(deci);
    }
    public static int bintodeci(int bin)
    {
        int place=1 ,deci=0 ;
        while(bin>0)
        {
            deci=deci + (bin%10)*place ;
            place*=2 ;
            bin/=10 ;
        }

        return deci ;
    }


}
