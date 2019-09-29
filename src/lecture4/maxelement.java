package lecture3.lecture4;

import java.util.Scanner;

public class maxelement {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter the value in array ");
            arr[i] = s.nextInt();
        }

    }


        public static int max(int arr[] ,int initial_index , int last_index)
        {
           // int max = arr[0];
            int max=initial_index ;
            //int y = 0;
            for (int i = max; i <=last_index; i++) {
//                if (max < arr[i]) {
//                    max = arr[i];
//                    y = i;
//                }
            if(arr[max]<arr[i])
            {
                max=i;
            }
            }
          //  System.out.println("the max value is " + max + "the maximum index " + y);
            return max ;
        }
}
