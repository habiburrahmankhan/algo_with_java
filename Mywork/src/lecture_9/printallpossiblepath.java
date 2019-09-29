package lecture_9;

import java.util.ArrayList;

public class printallpossiblepath {
    public static void main(String[] args) {
      //  ArrayList ar =new ArrayList() ;
     //   allpossiblepath( "",3,3 );
     //   allpossiblepath( "",3,3 ,ar);
     //   System.out.println(allpossiblepathwithlist( "",3,3 ));
     //   System.out.println(ar.toString());
        System.out.println(allpossiblepathwithlistcount("",3,3));

    }
//    public static void allpossiblepath( String processed , int row , int col )
//    {
//        if(row==1 && col==1)
//        {
//            System.out.println(processed);
//            return  ;
//        }
//       if (row>1)
//       {
//           allpossiblepath(processed+"V" ,row-1 , col);
//       }
//       if (col>1)
//       {
//           allpossiblepath(processed+"H" ,row ,col-1);
//       }
//
//    }


    public static void allpossiblepath( String processed , int row , int col ,ArrayList ar) {
        if (row == 1 && col == 1) {
           ar.add(processed) ;
            return ;
        }
        if (row > 1) {
          allpossiblepath(processed + "V", row - 1, col ,ar);
        }
        if (col > 1) {
            allpossiblepath(processed + "H", row, col - 1,ar);
        }

    }
    public static ArrayList allpossiblepathwithlist( String processed , int row , int col) {

        if (row == 1 && col == 1) {
            ArrayList ar = new ArrayList() ;
            ar.add(processed) ;
            return ar;
        }
        ArrayList ar = new ArrayList() ;
      ;
        if (row > 1) {
           ar.addAll( allpossiblepathwithlist(processed + "V", row - 1, col ));
        }
        if (col > 1) {
           ar.addAll( allpossiblepathwithlist(processed + "H", row, col - 1));
        }
        return ar ;
    }





    public static int allpossiblepathwithlistcount( String processed , int row , int col ) {

        if (row == 1 && col == 1) {
                         ;
            return 1 ;
        }
          int count=0;
        if (row > 1) {
           count+=allpossiblepathwithlistcount(processed + "V", row - 1, col);
        }
        if (col > 1) {
         count+= allpossiblepathwithlistcount(processed + "H", row, col - 1);
        }
        return count ;
    }
    }