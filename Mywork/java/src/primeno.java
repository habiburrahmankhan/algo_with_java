import java.util.Scanner;

public class primeno {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt() ;
        int p=2  , i;

        while(p<=n)
        {
            i=2 ;
            int count=0;
            while(i*i<=p)
            {
                if(p%i==0)
                {
                    count=1;
                   break ;
                }
                else
                {
                    i++ ;
                }
            }
            if(count==0)
            {
                System.out.println("the prime no  are " + p);
            }
            p++;
        }


    }
}