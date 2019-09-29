import java.util.Scanner;

public class pattern1 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in) ;
        int n = s.nextInt()  ;

       int i=1 ;
        int k =1 ;
        while (i<=n)
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
                System.out.print(k);
                if(j<=i)
                {
                    k++ ;
                }
                else
                {
                    k-- ;
                }
                j++ ;
            }
            System.out.println();
            i++ ;
        }






    }
}
