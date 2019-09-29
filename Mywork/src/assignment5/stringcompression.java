package assignment5;

import java.util.Scanner;

public class stringcompression {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        String a =s.next();
         compression(a);
    }
    public static void compression(String s)
    {
        int arr[] = new int[26];
        StringBuilder sb =new StringBuilder();
        char ch;
        for (int i = 0; i <s.length() ; i++) {
            ch=s.charAt(i);
            arr[ch-'a']++;
        }
        for (int i = 0; i <arr.length ; i++) {
            ch=(char)(97+i) ;
            if (arr[i]!=0 && arr[i]!=1)
            {
                sb.append(ch);
                sb.append(arr[i]);
            }
            else if(arr[i]==1)
            {
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());
    }
}
