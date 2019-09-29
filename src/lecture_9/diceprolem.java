package lecture_9;

import java.util.ArrayList;

public class diceprolem {
    public static void main(String[] args) {
        dice("" , 4) ;
        System.out.println(diceArraylist(0,4));
    }
    public static void dice(String processed ,int target)
    {
        if (target==0)
        {
            System.out.println(processed);
            return ;
        }
        for (int i = 1; i<=6 && i<=target ; i++)
        {
            dice(processed +i ,target-i);
        }
    }
    public  static ArrayList<String> diceArraylist(int cuurent ,int end)
    {
        if (cuurent==end )
        {
            ArrayList<String> basecase = new ArrayList<>();
            basecase.add("");
            return basecase ;
        }
        if (cuurent > end)
        {
            ArrayList<String> basecase  = new ArrayList<>();
            return basecase ;
        }
        ArrayList<String> mr = new ArrayList<>();
        for (int i = 1; i <=6 && i<=end; i++) {
            ArrayList<String> rr = diceArraylist(cuurent+i , end);
            for (String rrs : rr) {
                mr.add(i+ rrs) ;
            }
        }
        return mr ;
    }

}
