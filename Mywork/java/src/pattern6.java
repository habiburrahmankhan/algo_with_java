import java.util.Scanner;

public class pattern6 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int vmir=1;
         int n= s.nextInt() ;
         n=n/2 + 1 ;
        int i=1 ;
         while(vmir<=2*n-1)
         {
             int j=1 ,hmir=1 ;
             while(hmir<=2*n+1)
             {
                 if(hmir==n+1)
                 {
                     System.out.print("1");
                 }
                 else if (i<=j )
                 {
                     System.out.print("*");
                 }
                 else {
                     System.out.print("2");

                 }
                 if(hmir<=n)
                 {
                     j++ ;
                 }
                 else
                 {
                     j--;
                 }
                 hmir++ ;
             }
             if(vmir<n)
             {
                 i++;
             }
             else
             {
                 i--;
             }
             System.out.println();
             vmir++ ;

         }


    }

}
