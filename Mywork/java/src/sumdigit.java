import java.util.Scanner;

public class sumdigit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;

        int n =s.nextInt() ;
        int i=1;
        int sum_o=0,sum_e = 0 ;
        while (n>0)
        {
            if(i%2==0)
            {
                sum_e+=n%10 ;
            }
            else
            {
                sum_o+=n%10 ;
            }
            n/=10 ;
            i++;
        }
        System.out.println("the sum of odd digit is  " + sum_o + " the sum of even digit is  " + sum_e );


    }
}
