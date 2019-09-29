package lecture_19;

import java.util.HashMap;
import java.util.Map;

public class hashmapp {
    public static void main(String[] args) {
        Map <String ,String> map = new HashMap<>();
//        Map<Integer ,Integer> map1 = new HashMap<>();
//        map1.put(3,96) ;
//        map1.put(2 , 54 );
//        map1.put(1 , 56) ;
//        System.out.println(map1.keySet());
//        System.out.println(map1.values());
        map.put("apple" , "sweet red fruit") ;
        map.put("Mango" , "King of fruit" );
        map.put("orange" , "yum yum") ;
        System.out.println(map.get("apple") );
        map.remove("apple");
        System.out.println(map.keySet());
        System.out.println(map.values());
        for (String fruit: map.keySet()) {
            System.out.println(fruit);
        }
        for (String fruitvalues: map.values()) {
            System.out.println(fruitvalues);
        }
        System.out.println(find("aaaaavvdddsseesss"));
        System.out.println(vowel("aeoiuuufdedsdsfsdzaszfd"));
    }
    public static Map<Character , Integer> find(String str)
    {
        Map<Character , Integer> freq = new HashMap<>();
        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
             if (freq.containsKey(ch)) {
                 freq.put(ch, freq.get(ch) + 1);
             }
             else
             {
                 freq.put(ch,1);
             }
        }
        
       return freq;
    }


    public static Map<Character , Integer> vowel(String str)
    {
        Map<Character , Integer> freq = new HashMap<>();
        freq.put('a',0);
        freq.put('e',0);
        freq.put('i',0);
        freq.put('o',0);
        freq.put('u',0);
        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
            if (freq.containsKey(ch)) {
                freq.put(ch, freq.get(ch) + 1);
            }

        }
        return freq;
    }
}
