package assignment8a;

import java.util.Arrays;
import java.util.Scanner;

public class matheee {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i <n ; i++) {
            int a=s.nextInt();
            StringBuilder process[]=new StringBuilder[(int)(Math.pow(2,a))];
            count(a,'a','b', 0,process);
        }
    }
    public static void count(int n ,char a,char b ,int count,StringBuilder processed[] )
    {
        for (int i = 0; i < n; i++) {
            processed[count].append(a);

        }
        count++;
        for (int i = 0; i <Math.pow(2,n) /2 ; i++) {
            processed[count].insert(i,b);

           count++;
        }
        for (int i = 0; i <n ; i++) {
            processed[count].append(b);
        }
        count++;

        for (int i = 0; i <Math.pow(2,n) /2 ; i++) {
            processed[count].insert(i,a);
            count++;
        }
        System.out.println(Arrays.toString(processed));

    }
}
