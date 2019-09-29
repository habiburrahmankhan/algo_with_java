package hackerblock;

import java.util.Scanner;

public class MoveAllXatEnd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        moveend("", str, "");
    }
    public  static  void moveend(String proceesed , String unprocessed , String end )
    {
        if (unprocessed.length()==0)
        {
            System.out.println(proceesed + end);
            return ;
        }
       char ch = unprocessed.charAt(0);
       unprocessed=unprocessed.substring(1);
        if (ch!='x')
        {
             moveend(proceesed + ch , unprocessed , end) ;
        }
        else
        {
            moveend(proceesed , unprocessed , end+'x');
        }
    }


}
