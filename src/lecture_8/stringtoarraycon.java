package lecture_8;

import java.util.Arrays;
import java.util.Scanner;

public class stringtoarraycon {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        String sb=s.nextLine() ;
        String arr[] = sb.split(" " );
        System.out.println(Arrays.toString(arr));
        System.out.println("enter the digit");
        int n=s.nextInt() ;
        strtoarr(arr , n);
    }
    public static void strtoarr(String arr[] ,int n)
    {

       while(n>0)
       {
           String s1 ,s2;
           StringBuilder sb=new StringBuilder();
           StringBuilder sb2=new StringBuilder();
           int rem = n%10;
           n=n/10 ;
           if(arr[rem-1].length()%2==0)
           {
               s1=arr[rem-1].substring(0,arr[rem-1].length() /2);

               s2=arr[rem-1].substring(arr[rem-1].length() /2,arr[rem-1].length());
           }
           else
           {
               s1=arr[rem-1].substring(0,arr[rem-1].length() /2 +1);
               s2=arr[rem-1].substring(arr[rem-1].length() /2, arr[rem-1].length());
           }
           sb2.append(s1);
           sb.append(s2);
           sb.append(sb2.reverse()) ;
           System.out.println(sb.toString());
       }

    }
}
