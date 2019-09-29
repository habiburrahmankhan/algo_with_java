package lecture_12;

public class human {

    String name;
    int balance  ;
    final int hands;
//    public  human()
//    {
//        this.balance=10000;
//        this.name="hrkhan" ;
//    }
    public human()
    {
        this(10000 ,"hrkham");
    }
    public human(int balance ,String name)
    {
        this.balance=balance;
        this.name=name ;
        hands=11;
    }

    public human(human old)
    {
        this.balance=old.balance ;
        this.name=old.name ;
        this.hands=old.hands ;
    }

  //  static int balance=10000;      //

   // final int balance =10000 ;
//    public int  loan()
//    {
//        int t=balance/10 ;
//        balance-=t ;
//        System.out.println("haaa gareeb ho raha hu .... "+ balance);
//        return balance ;
//    }
//    public static void fest()                           // static function can call for without making object
//    {
//        System.out.println("hurray       hurray   ");
//    }
//    public void eat()
//    {
//        if (balance<100)
//        {
//            System.out.println("nikal yaha se ");
//        }
//        System.out.println("khana  do");
//        balance-=200;
//    }
//    public void nonstaticfest()
//    {
//        System.out.println("hurray       hurray   non static ");
//    }
//    public void bal(int balance)
//    {
//        this.balance=balance  ;
//        System.out.println(balance);
//    }
//    public void nonstaticcall()
//    {
//        System.out.println("non static calll ......");
//    }

}
