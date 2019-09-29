package lecture_13;

public class clientPC {
    public static void main(String[] args) {
        System.out.println("Case ---- 1 -----");
        p obj1 = new p();
        System.out.println(obj1.d);
        System.out.println(obj1.d1);
        obj1.fun();
        obj1.fun1();
        System.out.println("Case ---- 2 -----");
        p obj2 = new c();
        System.out.println(obj2.d);
        System.out.println(obj2.d1);
        System.out.println(((c)obj2).d2);
        obj2.fun();
        obj2.fun1();
        ((c)obj2).fun2();

        System.out.println("Case ---- 3 -----");
//        c obj3 = new p();
//        System.out.println(obj3.);
        System.out.println("Case ---- 4 -----");
        c obj4 = new c();
        System.out.println(obj4.d);
        System.out.println(((p)obj4).d);
        System.out.println(obj4.d1);
        System.out.println(obj4.d2);
        obj4.fun();
        obj4.fun1();
        obj4.fun2();

    }
}
