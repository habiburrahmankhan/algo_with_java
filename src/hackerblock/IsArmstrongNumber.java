package hackerblock;

import java.util.Scanner;

public class IsArmstrongNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m=n , sum=0;
        while(n>0)
        {
           int rem=n%10 ;
           sum+=rem*rem*rem;
           n/=10;
        }
        if(sum==m)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}
