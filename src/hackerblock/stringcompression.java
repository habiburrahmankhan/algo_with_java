package hackerblock;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class stringcompression {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;

        String str = s.next();
        StringBuilder sb = new StringBuilder();
        int m=0;
        for (int i = 0; i <str.length() ;) {
            int count=1;
            for (int j = i+1; j <str.length() ; j++) {
                if (str.charAt(i)==str.charAt(j))
                {
                    count++;
                }
                else
                {
                    break;
                }
            }
            sb.append(str.charAt(i));
            sb.append(count);
            i+=count;
        }
        System.out.println(sb);


    }


}
