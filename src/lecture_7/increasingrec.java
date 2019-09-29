package lecture_7;

public class increasingrec {
    public static void main(String[] args) {
        decrease(4);
        System.out.println();
        increase(4);
        System.out.println();
        increasedecreaseboth(4);
    }
    public static void decrease(int n)
    {
        if (n==0)
        {
            return ;
        }
        System.out.println(n);
        decrease(n-1);
    }

    public static void increase(int n)
    {
        if (n==0)
        {
            return ;
        }
        increase(n-1);
        System.out.println(n);
    }
    public static void increasedecreaseboth(int n)
    {
        if (n==0)
        {
            return ;
        }
        System.out.println(n);
        increasedecreaseboth(n-1);
        System.out.println(n);
    }

}
