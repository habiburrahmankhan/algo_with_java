import java.util.Scanner;

public class pattern7 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n= s.nextInt() ;
        int i=1 ;
        while(i<=n)
        {
            int j=1 ,hmir=1 ;
            while(hmir<=2*n-1)
            {
                if (i>=j )
                {
                    System.out.print(j);
                }
                else {
                    System.out.print(" ");

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