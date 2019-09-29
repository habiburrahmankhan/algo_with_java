package hackerblock;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class cbnumber {
    public static void main(String[] args) {
        Scanner s =  new Scanner(System.in) ;
        int n = s.nextInt();
        String str = s.next();
        ArrayList<String> arr = getsubsequence(str);
        cbno(arr);
    }
    public static void cbno(ArrayList<String> arr)
    {
        ArrayList<String> arrelement = new ArrayList<>();
        ArrayList<String> codingbno = new ArrayList<>();

        for (int i = 0; i <arr.size(); i++) {
            if (checkprime(Long.parseLong(arr.get(i))))
            {
                    arrelement.add(arr.get(i));
            }
        }
        if (arrelement.size()==0)
        {
            System.out.println(codingbno.size());
            return;
        }
        Collections.sort(arrelement);
        ArrayList<String> arrsubsequence  = getsubsequence(arrelement.get(0)) ;
        codingbno.add(arrelement.get(0));
        for (int i = 1; i <arrelement.size() ; i++) {
            int x=0;
            ArrayList<String> arrsubpresent = getsubsequence(arrelement.get(i)) ;
            for (String strsub: arrsubsequence) {
                for (String cbn:arrsubpresent) {
                    if (cbn.equals(strsub)) {
                        x = 1;
                        break;
                    }
                }
                if (x==1)
                {
                    break;
                }
            }
            if (x==0)
            {
                codingbno.add(arrelement.get(i)) ;
                arrsubsequence.addAll(0, getsubsequence(arrelement.get(i))) ;
            }
        //    System.out.println(arrsubsequence +  "subsequence");
        }
     //   System.out.println(arrelement + "element ");
        System.out.println(codingbno.size());
     //   System.out.println(codingbno);
    }

    public static Boolean checkprime(long no)
    {
       int i=2;
       if (no<2)
       {
           return false ;
       }
       while(i*i<=no)
       {
           if (no%i==0)
           {
               return false ;
           }
           else
           {
               i++ ;
           }

       }
       return true ;
    }
    public  static  ArrayList<String> getsubsequence(String str)
    {
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i <str.length() ; i++) {
            for (int j = i+1; j <=str.length() ; j++) {
                String ch = str.substring(i ,j);
                    arr.add(ch) ;
            }
        }
        return  arr ;
    }
}
