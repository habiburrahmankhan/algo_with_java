package hackerblock;

import java.util.Scanner;

public class printseries {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        int n1=s.nextInt();
        int n2=s.nextInt();
         int count=0 ,j=1;
         while(count!=n1)
         {
            int  sum=3*j+ 2 ;
             if (sum%n2!=0)
             {
                 System.out.println(sum);
                 count++;
             }
             j++;
         }
    }
}
