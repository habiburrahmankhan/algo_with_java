package assignment3;

public class ganeshpattern {
    public static void main(String[] args) {
        pattern(7);
    }

    private static void pattern(int n) {
        int i=0;
        while(i<n)
        {
            int j=0;
            while(j<n)
            {

                if(i==n/2 || j==n/2)
                {
                    System.out.print("*");
                }
                else if (j==0 && i<n/2)
                {
                    System.out.print("*");
                }
                else if (j==n-1 && i>n/2)
                {
                    System.out.print("*");
                }
                else if (i==0 && j>n/2)
                {
                    System.out.print("*");
                }
                else if (i==n-1 && j<n/2)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }

                j++;
            }
            System.out.println();
            i++;
        }
    }
}
