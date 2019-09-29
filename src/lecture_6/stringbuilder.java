package lecture_6;

public class stringbuilder {
    public static void main(String[] args) {

     StringBuilder builder = new StringBuilder("HelloWorld");

//        for (int i = 0; i < 10000000; i++) {
//            builder.append("a") ;
//        }
//        System.out.println(builder.toString());


        for (int i = 0; i < builder.length(); i++) {

         char ch=builder.charAt(i) ;

         if(ch>='A' && ch<='Z')
         {
             ch=(char)('a' + (ch - 'A'));
             builder.setCharAt(i ,ch);
         }
         else
         {
             ch=(char)('A' + ( ch - 'a')) ;
             builder.setCharAt(i ,ch);
         }

        }
        System.out.println(builder);



    }


}
