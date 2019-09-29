package assignment6;

public class nthtriangle {
    public static void main(String[] args) {
        System.out.println(ntriangle(3));
    }

    public static int  ntriangle(int n)
    {
        if (n==0)
        {
          return n;
        }
        return n + ntriangle(n-1);

    }
}

