package hackerblock;

import java.util.Scanner;

public class demobitmasking {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        System.out.println(n>>1);
        System.out.println(n<<1);
        System.out.println(n&1);
        String str ="abc";
        String st = "abd";
        if (str.compareTo(st)<0)
        {
            System.out.println("a");
        }
        else
        {
            System.out.println("b");
        }
    }
}
