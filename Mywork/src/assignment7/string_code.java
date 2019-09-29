package assignment7;



public class string_code {
    public static void main(String[] args) {
        dice("" , "1123" ,"1123") ;
    }
    public static void dice(String processed ,String target ,String target1)
    {
        if (target.isEmpty())
        {
            System.out.println(processed);
            return ;
        }

            char first =target.charAt(0);
            target = target.substring(1);
            dice(processed+(char)(first+48) ,target , target1 );
            target=processed+(first+48)  ;



    }

}
