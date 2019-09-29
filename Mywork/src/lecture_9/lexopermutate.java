package lecture_9;

import java.util.Arrays;

public class lexopermutate {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(freq("aabbcc")));
        String line="aab" ;
        int arr1[] = freq(line) ;
        lexo("" , line.length() , arr1);
    }
    public static int[] freq(String s)
    {
        int arr[] = new int[6];
        char ch;
        for (int i = 0; i <s.length() ; i++) {
            ch=s.charAt(i);
            arr[ch-'a']++;
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
                lexo(processed +(char)(i+'a'),length-1 , arr ) ;
                arr[i]++ ;
            }

        }
    }
    }
