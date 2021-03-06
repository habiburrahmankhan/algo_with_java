package assignment8a;

import java.util.ArrayList;

public class subsequenceofstr {
    public static void main(String[] args) {
        subsequence("" ,"abcd");
       System.out.println(subsequenceArraylist("" ,"abcd"));
        System.out.println(subsequencecount("" ,"abcd"));
    }
    public static int subsequencecount(String processed , String unprocessed)
    {

        if (unprocessed.isEmpty())
        {
            System.out.println(processed);
            return 1;
        }
        int count=0;
        char ch =unprocessed.charAt(0);
        unprocessed=unprocessed.substring(1);
        count+= subsequencecount(processed+ch ,unprocessed);
        count+= subsequencecount(processed ,unprocessed);
        return count ;
    }


    public static ArrayList subsequenceArraylist(String processed , String unprocessed)
    {

        if (unprocessed.isEmpty())
        {
             ArrayList ar = new ArrayList() ;
             ar.add(processed) ;
            return ar;
        }
        ArrayList ar=new ArrayList() ;
        char ch =unprocessed.charAt(0);
        unprocessed=unprocessed.substring(1);
        ar.addAll(subsequenceArraylist(processed+ch ,unprocessed));
        ar.addAll( subsequenceArraylist(processed ,unprocessed) );
        return ar ;
    }
    public static void subsequence(String processed , String unprocessed)
    {

        if (unprocessed.isEmpty())
        {
            System.out.println(processed);
            return ;
        }

        char ch =unprocessed.charAt(0);
        unprocessed=unprocessed.substring(1);
        subsequence(processed+ch ,unprocessed);
        subsequence(processed ,unprocessed);

    }
}