package lecture3;

import java.util.Scanner;

public class row_wiseprint {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
      int arr[][] = new int[3][3] ;

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.println("enter the arrays ");
                arr[i][j]=s.nextInt() ;
            }
        }
           printvalue(arr);
    }
    public static void printvalue(int arr[][])
    {

        for (int i = 0; i < arr.length ; i++) {
            int j ;
            if(i%2==0)
            {
                j=0;
            }
            else
            {
                j=arr[i].length -1 ;
            }
            int k=0 ;
            while(k< arr[i].length)
            {
                System.out.print(arr[i][j]  + " ");
                if(i%2==0)
                {
                   j++;
                }
                else
                {
                    j-- ;
                }
                k++ ;
            }
            System.out.println();
        }
    }
}
