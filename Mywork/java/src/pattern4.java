import java.util.Scanner;

public class pattern4 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in) ;
        pattern4 p = new pattern4() ;
        int n =s.nextInt() ;
        int i=0 ,c ,j;
           n=n-1 ;
        while (i<=n)
        {
             j=0 ;
            while(j<=i)
            {
                c=p.fact(i) / ( p.fact(i-j)*p.fact(j) ) ;
                System.out.print(" " + c +" ");
                j++;
            }
            System.out.println();
            i++ ;
        }

    }
    int fact(int k)
    {
        int fac=1;
        while(k>0)
        {
            fac=fac*k ;
            k-- ;
        }
        return fac ;
     }

}