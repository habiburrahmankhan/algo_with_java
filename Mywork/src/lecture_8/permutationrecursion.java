package lecture_8;


import java.util.ArrayList;
import java.util.Collections;

public class permutationrecursion {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        permutation("" , "abc") ;
        System.out.println(permutationArraylist("abc"));
    }
    public static void permutation(String processed , String unprocessed)
    {
        if(unprocessed.isEmpty())
        {
            System.out.println(processed);
            return ;
        }
        char ch = unprocessed.charAt(0);
        unprocessed=unprocessed.substring(1);
        for (int i = 0; i <=processed.length() ; i++) {
            String first = processed.substring(0,i);
            String second = processed.substring(i) ;
            permutation(first+ch+second , unprocessed) ;

        }
    }
    public  static ArrayList<String> permutationArraylist(String str)
    {
        if (str.length()==0)
        {
            ArrayList<String> basearray = new ArrayList<>();
            basearray.add("");
            return basearray ;
        }
        char ch = str.charAt(0);
        str = str.substring(1);
            ArrayList<String> rr = permutationArraylist(str);
            ArrayList<String> mr = new ArrayList<>();
        for (String rrs: rr) {
            for (int i = 0; i <=rrs.length() ; i++) {
                mr.add(str.substring(0,i) + ch + str.substring(i)) ;
            }
        }
        return  mr;
    }
}