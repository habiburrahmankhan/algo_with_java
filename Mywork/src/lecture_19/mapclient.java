package lecture_19;

public class mapclient {
    public static void main(String[] args) {
//        mapusinglinkedlist map = new mapusinglinkedlist() ;
//        map.put("apple" , "sweet red fruit") ;
//        map.put("Mango" , "King of fruit" );
//        map.put("orange" , "yum yum") ;
//        System.out.println(map.get("apple") );
//        map.remove("apple");
//        System.out.println(map.get("apple") );
//        System.out.println(map);
        mapusingarray mapa = new mapusingarray();
        mapa.put("apple" , "sweet red fruit") ;
        mapa.put("Mango" , "King of fruit" );
        mapa.put("orange" , "yum yum") ;
        System.out.println(mapa.get("apple") );
        mapa.remove("apple");
        System.out.println(mapa.get("apple") );

    }
}
