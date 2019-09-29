package lecture_8;

public class patternusingrecursion {
    public static void main(String[] args) {
        pattern(4,0);

    }
    public static void pattern(int row ,int column)
    {
        if (row==0)
        {
            return;
        }
        if (row==column)
        {
            System.out.println();
            pattern(row-1,0);
            return ;
        }
        System.out.print("* ");
        pattern(row ,column+1);

    }
}
