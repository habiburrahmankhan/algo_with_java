package assignment3;

import java.util.Scanner;

public class simplecalculator{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        char choice ;
        do
            {
            System.out.println("enter the no  ");
            int a = s.nextInt();
            System.out.println("enter the no ");

            int b = s.nextInt();
                System.out.println("enter symbol  +,-,*,/,%");
            char ch = s.next().charAt(0);
                System.out.println(a + " "+ch + " "+ b + " is " + calculator(ch ,a,b));
                System.out.println("do u want continue press any key  to exit press ( x or X )");
                choice = s.next().charAt(0) ;
                choice=Character.toUpperCase(choice) ;
        }while(choice!='X');
    }
    public static int calculator(char ch ,int a ,int b)
    {
        if(ch=='+')
        {
            return a+b;
        }
        else if(ch=='-')
        {
            return a-b ;
        }
        else if(ch=='*')
        {
            return a*b;
        }
        else if(ch=='/')
        {
            return a/b;
        }
        else if(ch=='%')
        {
            return a%b ;
        }
        else
        {
            System.out.println("invalid operation");
        }

       return 0 ;
    }


}
