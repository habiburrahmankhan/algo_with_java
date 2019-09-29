import java.util.Scanner;

public class pattern5 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in) ;
        int n =s.nextInt() ;
        int i=1;
        int a=0 ,b=1 ,c ;
        while (i<=n)
        {
            int j=1 ;
            while(j<=i)
            {
                System.out.print(a + " ");
                c=a+b;
                a=b;
                b=c;
                j++;
            }
            System.out.println();
                i++ ;
        }

    }
}

