package hackerblock;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class cbnumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String str = s.next();
        cbno(str);
    }

    private static void cbno(String str) {
        int count = 0;
        boolean b[] = new boolean[str.length()];
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                String sub = str.substring(i, j + 1);
              //
                //System.out.print(sub + "    ");
                if (checkcbno(Long.parseLong(sub)) && isValid(b, i, j + 1)){
                    count++;
                  //  System.out.println(sub);
                    for (int k = i; k <j+1 ; k++) {
                        b[k]=true ;
                    }
                 //   System.out.println(Arrays.toString(b));
                }

            }
        }
        System.out.println(count);

    }

    private static boolean isValid(boolean[] b, int i, int i1) {
        for (int j = i; j <i1 ; j++) {
            if (b[j])
            return false ;
        }
        return true ;
    }

    public static Boolean checkcbno(long no) {
        if (no < 2) {
            return false;
        }

        int arr[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        for (int i = 0; i < arr.length; i++) {
            if (no % arr[i] == 0 && no != arr[i]) {
                return false;
            }

        }

        return true;
    }
}

//    public static void main(String[] args) {
//        Scanner s =  new Scanner(System.in) ;
//        int n = s.nextInt();
//        String str = s.next();
//        ArrayList<String> arr = getsubsequence(str);
//        cbno(arr);
//    }
//    public static void cbno(ArrayList<String> arr)
//    {
//        ArrayList<String> arrelement = new ArrayList<>();
//        ArrayList<String> codingbno = new ArrayList<>();
//
//        for (int i = 0; i <arr.size(); i++) {
//            if (checkprime(Long.parseLong(arr.get(i))))
//            {
//                    arrelement.add(arr.get(i));
//            }
//        }
//        if (arrelement.size()==0)
//        {
//            System.out.println(codingbno.size());
//            return;
//        }
//        Collections.sort(arrelement);
//        ArrayList<String> arrsubsequence  = getsubsequence(arrelement.get(0)) ;
//        codingbno.add(arrelement.get(0));
//        for (int i = 1; i <arrelement.size() ; i++) {
//            int x=0;
//            ArrayList<String> arrsubpresent = getsubsequence(arrelement.get(i)) ;
//            for (String strsub: arrsubsequence) {
//                for (String cbn:arrsubpresent) {
//                    if (cbn.equals(strsub)) {
//                        x = 1;
//                        break;
//                    }
//                }
//                if (x==1)
//                {
//                    break;
//                }
//            }
//            if (x==0)
//            {
//                codingbno.add(arrelement.get(i)) ;
//                arrsubsequence.addAll(0, getsubsequence(arrelement.get(i))) ;
//            }
//          //  System.out.println(arrsubsequence +  "subsequence");
//        }
//   //    System.out.println(arrelement + "element ");
//        System.out.println(codingbno.size());
//      //  System.out.println(codingbno);
//    }
//
//
//    public  static  ArrayList<String> getsubsequence(String str)
////    {
////        ArrayList<String> arr = new ArrayList<>();
////        for (int i = 0; i <str.length() ; i++) {
////            for (int j = i+1; j <=str.length() ; j++) {
////                String ch = str.substring(i ,j);
////                    arr.add(ch) ;
////            }
////        }
////        return  arr ;
////    }