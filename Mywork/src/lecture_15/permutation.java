package lecture_15;

public class permutation {
    public static void main(String[] args) {
        permutation("","abc");
    }
    public static void permutation(String processed ,String unprocesssed)
    {
        if (unprocesssed.isEmpty())
        {
            System.out.println(processed);
            return;
        }
        char ch=unprocesssed.charAt(0);
        unprocesssed=unprocesssed.substring(1);
        for (int i = 0; i <=processed.length(); i++) {
            String first = processed.substring(0,i);
            String second = processed.substring(i);
            permutation(first+ch+second,unprocesssed);
        }
    }
}
