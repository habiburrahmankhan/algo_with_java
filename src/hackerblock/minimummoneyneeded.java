package hackerblock;

import java.util.ArrayList;
import java.util.Scanner;

public class minimummoneyneeded {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int w = s.nextInt();
        int[] val = new int[w];
        for (int i = 0; i <val.length ; i++) {
            val[i]=s.nextInt() ;
        }
        ArrayList<String>  arr = diceArraylist(0,w);
        System.out.println(arr);
        ArrayList<String> arr1 = new ArrayList<>();
        for (String str :arr ) {
            int sum=0;
            for (int  i = 0; i <str.length() ; i++) {
                int ch = str.charAt(i) - '0' ;
                if (val[ch-1]==-1)
                {
                    break;
                }
                sum+=ch;
            }
            if (sum==w)
            {
                arr1.add(str);
            }
        }
        int max = -1;
        int j=0;
        for (String str : arr1) {
            int sum=0;
            for (int  i = 0; i <str.length() ; i++) {
                int ch = str.charAt(i) - '0' ;
                if (val[ch-1]==-1)
                {
                    continue;
                }
                sum+=val[ch-1];

            }
            if (j==0)
            {
                max=sum;
            }
            j++ ;
            if (max>sum)
            {
                max=sum ;
            }
        }
        if (max==0)
        {
            max=-1 ;
            System.out.println(max);
        }
        else {
            System.out.println(max);

        }
    }

    public  static ArrayList<String> diceArraylist(int cuurent , int end)
    {
        if (cuurent==end )
        {
            ArrayList<String> basecase = new ArrayList<>();
            basecase.add("");
            return basecase ;
        }
        if (cuurent > end)
        {
            ArrayList<String> basecase  = new ArrayList<>();
            return basecase ;
        }
        ArrayList<String> mr = new ArrayList<>();
        for (int i = 1; i <=end ; i++) {
            ArrayList<String> rr = diceArraylist(cuurent+i , end) ;
            for (String rrs : rr) {
                mr.add(i+ rrs) ;
            }
        }
        return mr ;
    }
}
