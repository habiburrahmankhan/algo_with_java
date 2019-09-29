package hackerblock;

import java.util.Scanner;

public class piyushandmagicalpark {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n =scan.nextInt();
        int m =scan.nextInt();
        int k =scan.nextInt();
        int s =scan.nextInt();
        char[][] arr = new char[n][m] ;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                arr[i][j]=scan.next().charAt(0);
            }
        }

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                   if (arr[i][j]=='*')
                   {
                       s+=5;
                   }
                   else if(arr[i][j]=='.')
                   {
                       s-=2;
                   }
                   else if (arr[i][j]=='#')
                   {
                       break;
                   }
                   if (j!=arr[i].length -1 ) {
                       s--;
                   }
            }
            if (s<k)
            {
                break;
            }
        }
        if (s>=k)
        {
            System.out.println("Yes");
            System.out.println(s);
        }
        else
        {
            System.out.println("No");
        }



    }
}
