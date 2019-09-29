package lecture3;

import java.util.Scanner;

public class binarytodeci {

        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int deci =s.nextInt() ;
            int bin =decitobi(deci) ;
            System.out.println(bin);
        }
        public static int decitobi(int deci)
        {
            int bin=0 ;
            while(deci>0)
            {
                bin=bin*10 + (deci%2) ;
                //  place*=2 ;
                deci/=2 ;
            }

            return bin ;
        }

    }
