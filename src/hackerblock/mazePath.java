package hackerblock;

public class mazePath {
    public static void main(String[] args) {
        printmazepath(0,0,2,2,"");
        System.out.println(countmazepath(0,0,2,2));
        System.out.println();
        printmazepathdiagonal(0,0,2,2,"");
        System.out.println();
        System.out.println(countmazepathdiagonal(0,0,2,2));
    }

    private static void printmazepath(int srow ,int scol , int erow,int ecol ,String ans) {
        if (srow==erow && scol==ecol)
        {
            System.out.println(ans);
            return;
        }
        if (srow >erow || scol > ecol)
        {
            return ;
        }
        printmazepath(srow ,scol + 1 , erow ,ecol ,ans + 'V');
        printmazepath(srow+1 ,scol , erow ,ecol ,ans + 'H');


    }
    private static int countmazepath(int srow ,int scol , int erow,int ecol) {
        if (srow==erow && scol==ecol)
        {
            return 1;
        }
        if (srow >erow || scol > ecol)
        {
            return 0 ;
        }
          int count=0;
        count+=countmazepath(srow ,scol + 1 , erow ,ecol);
        count +=countmazepath(srow+1 ,scol , erow ,ecol);

      return count ;
    }

    private static void printmazepathdiagonal(int srow ,int scol , int erow,int ecol ,String ans) {
        if (srow==erow && scol==ecol)
        {
            System.out.println(ans);
            return;
        }
        if (srow >erow || scol > ecol)
        {
            return ;
        }
        printmazepathdiagonal(srow ,scol + 1 , erow ,ecol ,ans + 'V');
        printmazepathdiagonal(srow+1 ,scol , erow ,ecol ,ans + 'H');
        printmazepathdiagonal(srow+1 ,scol+1 , erow ,ecol ,ans + 'D');


    }
    private static int countmazepathdiagonal(int srow ,int scol , int erow,int ecol) {
        if (srow==erow && scol==ecol)
        {

            return 1;
        }
        if (srow >erow || scol > ecol)
        {
            return 0;
        }
        int count=0;
        count+=countmazepathdiagonal(srow ,scol + 1 , erow ,ecol );
        count+=countmazepathdiagonal(srow+1 ,scol , erow ,ecol );
        count+=countmazepathdiagonal(srow+1 ,scol+1 , erow ,ecol);
   return count;

    }
}
