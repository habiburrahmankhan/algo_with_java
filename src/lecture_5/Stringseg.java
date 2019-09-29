package lecture_5;

public class Stringseg {
    public static void main(String[] args) {
        String s = "hello" ;
        String line="hello" ;
        for (int i = 0; i <s.length() ; i++) {
            for (int j =i; j<s.length() ; j++) {
                System.out.println(s.substring(i , j+1));

            }
        }
       int count =0 ;
        int si=0;
          while(true)
          {
                int loc = s.indexOf("l" , si);
                if(loc==-1)
                {
                    break;
                }
              System.out.println(loc);
                si=loc+1 ;
                 count++ ;
        System.out.println(count);
        }

    }
}
