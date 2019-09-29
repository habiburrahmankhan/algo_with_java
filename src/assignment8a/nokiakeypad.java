package assignment8a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class nokiakeypad {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in) ;
        System.out.println("enter the no of digit ");
        String m=s.next();
        String searchIn [] = {
                "prateek", "sneha", "deepak", "arnav", "shikha", "palak",
                "utkarsh", "divyam", "vidhi", "sparsh", "akku"
        };
            nokiakeypadstring(m ,"" ,searchIn);
      //  System.out.println(Arrays.toString(arrrem));

    }
    public static void nokiakeypadstring(String unprocessed ,String processed ,String searchIn[])
    {
        if (unprocessed.isEmpty())
        {
            for (int i = 0; i <searchIn.length; i++) {
                if (searchIn[i].indexOf(processed ,0)!=-1)
                {
                    System.out.println(searchIn[i]);
                }
            }
          //  System.out.println(processed);
            return ;
        }
       int digit=unprocessed.charAt(0)-'0';
        for (int i = (digit-2)*3; i <(digit-1)*3 ; i++) {
            if (i==26)
            {
                continue;
            }
            char ch=(char)(i+'a') ;
            nokiakeypadstring(unprocessed.substring(1) ,processed+ch ,searchIn);
        }



    }
}
