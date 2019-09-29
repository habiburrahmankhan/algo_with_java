package assignment8a;
import java.util.*;
public class prateek_candle {
    public static void main(String args[]) {
        Scanner s= new Scanner(System.in);
        int n =s.nextInt();
        int prime[] =new int[n] ;
        for (int i=0;i<n ;i++ )
        {
            prime[i]=s.nextInt() ;

        }
        boolean[]  arr=new boolean[1000000] ;
        for (int j=2;j*j<=arr.length ;j++ )
        {
            if (!arr[j])
            {
                for (int k=2*j;k*k<=arr.length ;k+=j)
                {
                    arr[k]=true ;
                }
            }
        }
        int i=0 ;
        while(i<prime.length)
        {
            int p=0;
            int count=0 ;
            for (int k=2;count<prime[i];k++)
            {
                if(!arr[k])
                {
                    count++;
                    p=k;
                }
            }
            System.out.println(p);
            i++;
        }
    }
}