package hackerblock;

import java.util.Arrays;
import java.util.Scanner;

public class permutation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String line=s.next();
        int arr1[] = freq(line) ;
        lexo("" , line.length() , arr1);
    }
    public static int[] freq(String s)
    {
        int arr[] = new int[s.length()];
        char ch;
        for (int i = 0; i <s.length() ; i++) {
            ch=s.charAt(i);
            arr[ch-'A']++;
        }

        return arr ;
    }
    public static void lexo(String processed , int length ,int arr[])
    {
        if (length==0)
        {
            System.out.println(processed);
        }
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] > 0)
            {
                arr[i]-- ;
                lexo(processed +(char)(i+'A'),length-1 , arr ) ;
                arr[i]++ ;
            }

        }
    }
}