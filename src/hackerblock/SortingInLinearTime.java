package hackerblock;

import java.util.Scanner;

public class SortingInLinearTime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int[] arr = new int[n];
        int freq[] ={0,0,0};
        for (int i = 0; i <n ; i++) {
            arr[i]=s.nextInt();
            freq[arr[i]]++;
        }
        int j=0;
         while(j<3)
         {
            if (freq[j]==0)
            {
                j++;
                if (j==3)
                {
                    break;
                }
            }
            if (freq[j]>0)
            {
                System.out.println(j);
                freq[j]--;
            }

        }


    }
}
