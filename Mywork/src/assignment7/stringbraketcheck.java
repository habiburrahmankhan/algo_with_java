package assignment7;

import java.util.Scanner;

public class stringbraketcheck {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        String str ="[a + {b + (c + d) + e} + f]" ;
        System.out.println(braketcheck(str ,"" ,0 ,-1) );
    }
    public static boolean braketcheck(String str ,String  arr,int i ,int top )
    {
        if (str.length()==i)
        {
            if(arr.isEmpty())
            {
                return true ;
            }
            else
            {
                return false ;
            }

        }
        if (str.charAt(i)=='[' || str.charAt(i)=='{' ||  str.charAt(i)=='(')
        {
            arr+=str.charAt(i);
            ++top;
        }
        if (!arr.isEmpty())
        {
            if ((str.charAt(i) == '}' && arr.charAt(top) == '{') || (str.charAt(i) == ']' && arr.charAt(top) == '[') || (str.charAt(i) == ')' && arr.charAt(top) == '(')) {
                arr = arr.substring(0, top);
                top--;
            }
        }
        else
        {
            return false ;
        }
        return braketcheck(str ,arr ,i+1 ,top) ;


    }
}
