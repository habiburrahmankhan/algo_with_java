package hackerblock;

import java.util.Scanner;

public class ultrafastmathematian {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        int test= s.nextInt();
        for (int i = 0; i < test; i++) {
            String str1 =s.next();
            String str2 = s.next();
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j <str1.length() ; j++) {
                if (str1.charAt(j)==str2.charAt(j))
                {
                    sb.append("0");
                }
                else {
                    sb.append("1");

                }
            }
            System.out.println(sb);
        }
    }
}
