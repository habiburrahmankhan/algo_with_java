import java.util.Scanner;

public class pattern8 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n= s.nextInt() ;
        int i=1 ;
        while(i<=n)
        {
            int j=1 ,hmir=1 ,space=1 ;
            while(hmir<=2*n-1)
            {
                while(space<=n-i)
                {
                    System.out.print(" ");
                    space++ ;
                }
                if (i>=j )
                {
                    System.out.print(j);
                }

                if(hmir<n)
                {
                    j++ ;
                }
                else
                {
                    j--;
                }
                hmir++ ;
            }

            i++;

            System.out.println();

        }


    }

}