package lecture_6;

public class asciiacfpattern {
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder("acfg") ;
        insertpattern(s) ;
    }
    public static void insertpattern(StringBuilder s)
    {
        StringBuilder a=new StringBuilder() ;
        a.append(s.charAt(0));
        for (int i = 0; i <s.length()-1 ; i++) {
            int c =s.charAt(i+1) -  s.charAt(i); //Math.abs(s.charAt(i+1) -  s.charAt(i)) ;
            a.append(c) ;
            a.append(s.charAt(i+1)) ;
        }
        System.out.println(a.toString());
    }
}
