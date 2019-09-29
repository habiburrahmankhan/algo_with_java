import java.util.Scanner;

public class vmirpattern {



        public static void main(String[] args) {

            Scanner s = new Scanner(System.in) ;
            System.out.println(" Enter the value of n to print pattern :- ");
            int n = s.nextInt()  ;

            int i=1 ;
            n=n/2 +1 ;
            int vmir=1 ;
            while (vmir<=2*n -1)
            {
                int space =1 ;

                while (space<=n-i)
                {
                    System.out.print(" ");
                    space++ ;
                }
                int j=1 ;
                while (j<= 2*i - 1 )
                {
                    System.out.print("*");

                    j++ ;
                }
                System.out.println();
                if(vmir<n)
                {
                    i++ ;
                }
                else
                {
                    i-- ;
                }
                vmir++ ;
            }

        }
    }
