package hackerblock;

import java.util.Scanner;

public class basiccalculator {
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        char ch=in.next().charAt(0);
        do{
            if(ch=='+'||ch=='-'||ch=='*'||ch=='/' || ch=='%') {
                int n1 = in.nextInt();
                int n2 = in.nextInt();
                if (ch == '+')
                    System.out.println(n1 + n2);
                else if (ch == '-')
                    System.out.println(n1 - n2);
                else if (ch == '*')
                    System.out.println(n1 * n2);
                else if(ch=='/'&&n2!=0)
                    System.out.println(n1 / n2);
                else if(ch=='/'&&n2!=0)
                    System.out.println(n1%n2);
            }
            else if(ch=='X'||ch=='x')
            {
                System.exit(0);
            }
            else{
                System.out.println("Invalid operation. Try again.");
            }
            ch=in.next().charAt(0);
        }while(ch>0);
    }

}
