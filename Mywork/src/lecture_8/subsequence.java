package lecture_8;

import java.util.ArrayList;
import java.util.Collections;

public class subsequence {
    public static void main(String[] args) {
        subsequence("" , "abc") ;
        ArrayList<String> ar = subsequenceArraylist("abc");
                Collections.sort(ar);
        System.out.println(ar);
    }
    public static void subsequence(String processed , String unprocessed )
    {
        if(unprocessed.isEmpty())
        {
            System.out.println(processed);
            return ;
        }
        char ch = unprocessed.charAt(0);
        unprocessed=unprocessed.substring(1);
        subsequence(processed+ch , unprocessed );
        subsequence(processed,unprocessed);

    }

    public static ArrayList<String> subsequenceArraylist(String processed)
    {
         if (processed.length()==0)
         {
             ArrayList<String> baseresult = new ArrayList<>();
             baseresult.add("");
             return baseresult ;
         }
        char ch=processed.charAt(0);
        processed=processed.substring(1);
        ArrayList<String> myresult = new ArrayList<>();
        ArrayList<String>   recucall = subsequenceArraylist(processed) ;
        for (int i = 0; i <recucall.size() ; i++) {
            myresult.add(recucall.get(i));
            myresult.add(ch + recucall.get(i)) ;
        }
       return myresult ;
    }


}
