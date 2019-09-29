package hackerblock;

import java.util.ArrayList;
import java.util.Scanner;

public class sumofarray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();

        int[] arr1=new int[n];
        for (int i = 0; i <arr1.length ; i++) {
            arr1[i]=s.nextInt();
        }
        int m =s.nextInt();
        int[] arr2=new int[m];
        for (int i = 0; i <arr2.length ; i++) {
            arr2[i]=s.nextInt();
        }
        ArrayList ar = new ArrayList();
        int carry=0;
        while(m>0 &&n>0)
        {
            int sum=(arr2[m-1]+arr1[n-1] + carry);
            ar.add(sum%10);
            carry=sum/10;
            m--;
            n--;
        }
        while(m>0)
        {
            int sum=(arr2[m-1]+ carry);
            ar.add(sum%10);
            carry=sum/10;
            m--;

        }
        while(n>0)
        {
            int sum=(arr1[n-1] + carry);
            ar.add(sum%10);
            carry=sum/10;
            m--;
        }
        if (carry>0)
        {
            ar.add(carry);
        }
        for (int i = ar.size()-1; i>=0 ; i--) {
            System.out.print(ar.get(i) +" , ");
        }
        System.out.print("END");
    }


}
