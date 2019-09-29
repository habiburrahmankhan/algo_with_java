package assignment7;

public class multiplication_withoutsymbol {
    public static void main(String[] args) {
        System.out.println(multiplication(3,-7 ,0));
    }
    public static int multiplication(int a ,int b ,int ans )
    {
        if (b==0)
        {
            return ans ;
        }
        if (b<0)
        {
            return   multiplication(a,b+1 , (ans-a));
        }
         return multiplication(a,b-1 , (ans+a));

    }
}
