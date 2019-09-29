package hackerblock;

import java.util.Scanner;

public class incredibleHulk {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in) ;
        int test = s.nextInt();
        for (int i = 0; i <test ; i++) {
            int n =s.nextInt();
            incredible(n);
        }
    }
    public static void incredible(int n)
    {
        int count=0;
          while(n>0)
          {
              count+=n&1 ;
               n=n>>1 ;
          }
        System.out.println(count);
    }
}
