package lecture_11;

import java.util.*;
public class rootttt {
    public static void main(String args[]) {
        Scanner s =new Scanner(System.in);
//        String numbers =s.nextLine();
//        String parts[] = numbers.split(" ");
//        System.out.println(Arrays.toString(parts));
//        int a = Integer.parseInt(parts[0]);
//        int b = Integer.parseInt(parts[1]);
//        int c = Integer.parseInt(parts[2]);

        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();




        roots(a,b,c);

    }
    public static void roots(int a ,int b ,int c )
    {
        float d=(b*b - 4*a*c) ;
        if (d==0)
        {
            System.out.println(" real and equal  ");
            System.out.println((float)-b/2*a + "  "+ (float)-b/2*a ) ;
        }
        else if(d>0)
        {
            float x1=(float)((-b-Math.sqrt(d))/2*a);
            float x2=(float)((-b+Math.sqrt(d))/2*a);

            System.out.println("Real and Distinct");
            System.out.println( x1+ "  "+x2) ;
        }
        else
        {
            System.out.println("imaginary");
        }
    }
}