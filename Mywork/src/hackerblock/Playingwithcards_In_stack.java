package hackerblock;

import java.util.Scanner;
import java.util.Stack;

public class Playingwithcards_In_stack {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int q = s.nextInt();
        Stack<Integer> stk= new Stack<>();
        for (int i = 0; i < n; i++) {
            stk.push(s.nextInt());
        }
        for (int i = 0; i < q; i++) {
            playwithcard(stk ,checkprime(i+1));
        }
        while(!stk.isEmpty())
        {
            System.out.println(stk.pop());
        }
    }

    public static void playwithcard(Stack<Integer> stk , int prime)
    {

               Stack<Integer> a = new Stack<>();
               Stack<Integer> b = new Stack<>();
               if (stk.isEmpty())
                   return;
               while(!stk.isEmpty())
               {
                   int item=stk.pop();
                   if (item%prime==0)
                   {
                       b.push(item);
                   }
                   else
                   {
                       a.push(item);
                   }
               }
               while(!b.isEmpty())
               {
                   System.out.println(b.pop());
               }
               while (!a.isEmpty())
               {
                 b.push(a.pop());
               }
                while (!b.isEmpty())
                {
                    stk.push(b.pop());
                }

    }

    public static  int checkprime(int i)
    {

        int k=0,primeno=2;
       boolean[] prime = new boolean[100000+1];
        for (int j = 2; j*j<=prime.length && k<i; j++) {
             if (!prime[j]) {
                 for (int l = 2*j; l*l<= prime.length; l+=j) {
                        prime[l]=true;
                 }
             }
             if (!prime[j])
             {
                 k++;
                 primeno=j;
             }
        }
        return primeno;
    }
}
