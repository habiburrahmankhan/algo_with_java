package lecture_15;

public class client {
    public static void main(String[] args) {
        javateacher jt = new javateacher();
        jt.dance();
        jt.study();
        jt.teach();
        teachingassistance ta = new teachingassistance() ;
        ta.bunk();
        ta.dance();
        ta.teach();
    }
}
