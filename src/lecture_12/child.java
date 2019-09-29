package lecture_12;

public class child {
    public static void main(String[] args) {
        human h=new human() ;
        System.out.println(h.name + h.balance);
        human h1 = new human(1000,"skkhan")  ;
        System.out.println(h1.name  +h1.balance);
//        h.name="hrkhan" ;  //instance variable
//
//        System.out.println(h.name);
//        System.out.println(h.balance);
//        h.loan();
//        h.loan();
//        h.loan();
//        human h1 = new human();
//        System.out.println(h1.balance);
//        h1.fest() ;
//        h.fest();
//        human.fest();
//        h.nonstaticfest();
//        h1.bal(100);
//        h.nonstaticcall();




    }
}
