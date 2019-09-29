package hackerblock;
import java.util.*;
public class countsunsequence {
         public   int count=0;
        public static void main(String args[]) {
            countsunsequence cs =new countsunsequence();
            Scanner s = new Scanner(System.in);
            String str =s.next();
            cs.subbsequence(str,"" );
            System.out.println(cs.count);
        }
        public  void subbsequence(String unprocessed ,String processed)
        {
            if (unprocessed.isEmpty())
            {
                count++;
                System.out.print(processed + " ");
                return;
            }
            char ch = unprocessed.charAt(0);
            unprocessed=unprocessed.substring(1);
            subbsequence(unprocessed ,processed );
            subbsequence(unprocessed ,ch+processed);
        }
    }


