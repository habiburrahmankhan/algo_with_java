package hackerblock;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Maximum_Circles {
    private static class minmaxlen implements Comparable<minmaxlen>
    {
        long start ;
        long end ;
        public minmaxlen(long center , long r)
        {
            start = center -r;
            end = center + r ;
        }

        @Override
        public int compareTo(minmaxlen o) {
            return (int) (this.end - o.end);
        }
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        ArrayList<minmaxlen> circles = new ArrayList<>();
        long  n = s.nextLong();
        for (int i = 0; i <n ; i++) {
            long c  = s.nextLong();
            long r  =s.nextLong();
            minmaxlen cir  =new  minmaxlen(c,r);
            circles.add(cir);
        }
        Collections.sort(circles);
        minmaxlen key0 = circles.get(0);
        long count = 1 , longial=key0.start , last = key0.end  ;
        System.out.println(circles.get(0).start + " :-: " + circles.get(0).end);
        for (int i = 1; i <circles.size() ; i++) {
            System.out.println(circles.get(i).start + " :-: " + circles.get(i).end);
            if (circles.get(i).start>= last)
            {
                longial = circles.get(i).start;
                last = circles.get(i).end;
                count++ ;
            }
        }

        System.out.println(n-count);
    }




}
//4
//        1 1
//        2 1
//        3 1
//        4 1