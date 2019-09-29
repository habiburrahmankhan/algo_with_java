package codechef;

import java.util.Scanner;

public class eidi {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t=s.nextInt();
        for (int i = 0; i <t ; i++) {
            int a1=s.nextInt();
            int a2 = s.nextInt();
            int a3 = s.nextInt();
            int c1=s.nextInt();
            int c2=s.nextInt();
            int c3=s.nextInt();
            if ((a1>a2 && c1>c2) || (a1<a2 && c1<c2) || (a1==a2 && c1==c2))
            {
                if ((a2>a3 && c2>c3) || (a2<a3 && c2<c3) || (a2==a3 && c2==c3))

                {
                    if ((a1>a3 && c1>c3) || (a1<a3 && c1<c3) || (a1==a3 && c1==c3))
                    {
                        System.out.println("fair");
                    }
                    else
                    {
                        System.out.println("Not fair");
                    }

                }
                else
                {
                    System.out.println("Not fair");
                }
            }
            else
            {
                System.out.println("Not fair");
            }


        }

    }
}
