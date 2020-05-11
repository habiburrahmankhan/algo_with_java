package DP;
import java.util.Scanner ;
public class subsetsumproblem {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = s.nextInt();
        int arr[] = new int[n];
        for(int i= 0 ; i < n ;i++)
        {
            arr[i]=s.nextInt();
        }
        if(subset(arr , sum))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
    public static boolean subset(int arr[] , int sum)
    {
        boolean[][]  dp = new boolean[arr.length + 1 ][sum +1] ;
        for(int i =0 ; i <dp.length ; i++ )
        {
            dp[i][0] = true ;
        }
        for(int i =1 ; i < dp[0].length ; i++)
        {
            dp[0][i] = false ;
        }
        for(int i = 1 ; i < dp.length ; i++)
        {
            for(int j =1;j < dp[0].length ; j++)
            {
                if(arr[i-1] <= j)
                {
                    dp[i][j] = dp[i-1][j -arr[i-1]] || dp[i-1][j];
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[arr.length][sum];
    }
}
