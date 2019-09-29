package lecture_9;

public class lexopermutateno {
    public static void main(String[] args) {
        lexodictono(120,0);
    }


    public static void lexodictono(int target , int present)
    {
        if (target<present)
        {
            return ;
        }
        System.out.println(present);
        for (int i =0; i <10; i++) {
             if (present==0&&i==0)
             {
                 continue;
             }
                lexodictono(target,present*10+i);

        }
    }
}
