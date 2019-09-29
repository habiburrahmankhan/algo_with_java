package assignment5;

import java.util.Scanner;

public class maximumfrequency {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        String pali =s.next();
        System.out.println(maxfrequency(pali));

    }
    public static StringBuilder  maxfrequency(String s)
    {
//        int max=0 ;
//        char y=0 ;
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i <s.length() ; i++) {
//            int count=0 ;
//            for (int j = 0; j <s.length() ; j++) {
//                if (s.charAt(i)==s.charAt(j))
//                {
//                    count++ ;
//                }
//            }
//            if(max<=count)
//            {
//                max=count ;
//                y=s.charAt(i);
//            }
//
//        }
//        sb.append(y);
//        sb.append(max);


        int arr[] = new int[26];
        StringBuilder sb =new StringBuilder();
        char ch;
        for (int i = 0; i <s.length() ; i++) {
            ch=s.charAt(i);
            arr[ch-'a']++;
        }

        return sb ;
    }
}
