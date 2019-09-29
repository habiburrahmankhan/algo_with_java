package hackerblock;

import java.util.Scanner;

public class trickyPermutation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str= s.next();
        int[] freq=new int[26];
        int[] arr=new int[26];
        for (int i = 0; i < str.length(); i++) {
             char ch =str.charAt(i);
             freq[ch-'A']++;
             arr[ch-'A']++;
        }
        String st="";
        for (int i = 0; i <26; i++) {
            if (freq[i]>0)
            {
                while(freq[i]>0)
                {
                st+=(char)(i+'A');
                freq[i]--;
                }
            }
        }
        System.out.println(st);
         permutation(st ,arr,"",0);
    }
    public static void permutation(String str , int[] freq,String processed,int level)
    {
        if (str.length()==level)
        {
            System.out.println(processed);
            return;
        }


        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
                 if (freq[i]==0) {
                     continue;
                 }
                     freq[i]--;
                     permutation(str, freq, processed + (char)(i+'A'), level + 1);
                     freq[i]++;

        }

    }

}
