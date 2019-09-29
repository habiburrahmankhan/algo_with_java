package hackerblock;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class largestnoarray {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int test=s.nextInt();
        for (int i = 0; i <test ; i++) {
             int n=s.nextInt();
            int[]  arr1 = new int[n];
            ArrayList<String> arr = new ArrayList<>();
            for (int j = 0; j <n; j++) {
                arr1[j]=s.nextInt();
                arr.add(String.valueOf(arr1[j]));
            }

          //  System.out.println(arr);
             Collections.sort(arr);
             Collections.reverse(arr);
            char ch  =arr.get(0).charAt(0);
            String k="";
            for (int j = 0; j <arr.size()-1 ; j++) {
                String str = arr.get(j) ;
                if (str.charAt(0)==ch)
                {
                   continue;
                }
                else
                {
                       k= arr.get(j-1);
                    break ;
                }

            }
            String largest = k;
            for (String st: arr) {
                if (st.equals(k))
                {
                    continue;
                }
                largest+=st ;
            }
            System.out.println(Long.parseLong(largest));


        }
    }

}
//test case :- 1 4 54 546 548 60
// 1 8 1 34 3 48 4 46 45 49
//  1 8 1 34 3 98 9 76 45 4