package lecture_15;

public class subsequence {
    public static void main(String[] args) {
        subsequence("" ,"abc");
    }
    public static void subsequence(String processed ,String unprocessed)
    {
        if (unprocessed.isEmpty())
        {
            System.out.println(processed);
            return;
        }
        char ch=unprocessed.charAt(0);
        unprocessed=unprocessed.substring(1);
        subsequence(processed+ch , unprocessed);
        subsequence(processed,unprocessed);
    }
}
