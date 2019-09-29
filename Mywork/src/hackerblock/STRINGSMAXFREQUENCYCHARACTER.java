package hackerblock;

import java.util.Arrays;
import java.util.Scanner;

public class STRINGSMAXFREQUENCYCHARACTER {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int[] cha = new int[26];
        for (int i = 0; i <str.length() ; i++) {
            char ch =str.charAt(i);
            cha[ch-'a']++;
        }
       int max=0;
        for (int i = 0; i <cha.length ; i++) {
            if (cha[max] < cha[i])
            {
                max=i;
            }
        }
        char freq= (char) (max  +'a');
        System.out.println(freq);
    }
}
