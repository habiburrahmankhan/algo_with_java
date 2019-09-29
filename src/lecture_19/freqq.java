package lecture_19;

import java.util.Scanner;

public class freqq {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        int test=s.nextInt();
        for (int i = 0; i <test ; i++) {
            int k=s.nextInt();
            String str =s.next();
            int arr[] = freq(str);
            int max= 0 ,sum=0;
            for (int l = k; l >0 ; l--) {

                for (int j = 1; j < arr.length; j++) {
                    if (arr[max] < arr[j]) {
                        max = j;
                    }
                }
                    arr[max]--;

            }

            for (int j = 0; j <str.length() ; j++) {
                if (arr[j]>0)
                {
                    sum+=arr[j]*arr[j] ;
                }
            }
            System.out.println(sum);

        }
    }

    public static int[] freq(String s)
    {
        int arr[] = new int[26];
        char ch;
        for (int i = 0; i <s.length() ; i++) {
            ch=s.charAt(i);
            arr[ch-'a']++;
        }

        return arr ;
    }
}
