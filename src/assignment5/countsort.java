package assignment5;

import java.util.Scanner;

public class countsort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        String a =s.next();
        countsort(a);
    }
    public static void countsort(String s )
    {
        int arr[] = new int[26];
        StringBuilder sb =new StringBuilder();
        char ch;
        for (int i = 0; i <s.length() ; i++) {
            ch=s.charAt(i);
            arr[ch-'a']++;
        }

        for (int i = 0; i <arr.length ; i++) {
            while(arr[i]>0)
            {
                ch=(char)(97 + i);
                sb.append(ch) ;
                arr[i]-- ;
            }
        }
        System.out.println(sb.toString());
    }
}
