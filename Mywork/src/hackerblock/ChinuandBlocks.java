package hackerblock;

import java.util.HashMap;
import java.util.Scanner;

public class ChinuandBlocks {
    public static void main (String args[]) {
        Scanner s = new Scanner(System.in) ;
        int n = s.nextInt() ;
        HashMap<Integer , long[] > map = new HashMap<>();

        long[][]   mat = new long[n][3] ;
        long sumarr[] = new long[n] ;
        for (int i = 0; i <n ; i++) {
            long sum = 0 ;
            long arr[] = new long[3];
            arr[0] = s.nextLong();
            arr[1] = s.nextLong();
            arr[2] = s.nextLong();
                mat[i][0] = arr[0] + arr[1] ;
                mat[i][1] = arr[1]  + arr[2] ;
                mat[i][2] = arr[0] + arr[2] ;
                map.put(i ,arr );
                sum = arr[0] * arr[1] * arr[2] ;
                sumarr[i] = sum  ;
        }
        ChinuandBlocksfn(map , mat , sumarr) ;
    }

    private static void ChinuandBlocksfn(HashMap<Integer,long[]> map , long[][] mat , long[] sumarr) {
        int n = map.size() ;
        int row = 0 , col = 0  ;long  max_size = 0  ;
        for (int k= 0; k <3 ; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i != j && mat[i][k]==mat[j][k]) {
                         long  sum = map.get(i)[(k)%3]  *   map.get(i)[(k+1)%3] * ( map.get(i)[(k+2)%3] + map.get(j)[(k+2)%3] ) ;
                        if(max_size <=sum)
                        {
                            max_size  = sum ;
                            row = i;
                            col = j;
                        }
                        }
                    }
                }
            }
        if (row==0 && col==0)
        {
            System.out.println("1");
            long max = 0 , index=0 ;
            for (int i = 0; i <sumarr.length ; i++) {
                if (max < sumarr[i])
                {
                    max = sumarr[i] ;
                    index = i ;
                }
            }
            System.out.println(index + 1 );
        }
        else
        {
            System.out.println("2");
            System.out.println((Math.min(row , col) + 1 ) + "  " + (Math.max(row , col ) + 1) );
        }
        }

}
