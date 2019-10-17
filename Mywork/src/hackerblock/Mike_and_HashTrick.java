package hackerblock;

import java.util.*;

public class Mike_and_HashTrick {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        int n  = s.nextInt() ;
        int arr[]  =new int[n] ;
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=s.nextInt();
        }
         HashMap<Integer , Integer>  ans = mikeHash(arr);
        for (Integer key:ans.keySet()
             ) {
            System.out.println(arr[ans.get(key)]);

        }

    }

    private static HashMap<Integer, Integer>  mikeHash(int[] arr) {
        HashMap<Integer ,Integer> map_1 = new HashMap<>();
        ArrayList<Integer> arrlist = new ArrayList<>();
      //  int count = 0;
        for (int i = 0; i <arr.length; i++) {
            if (!map_1.containsKey(arr[i]))
            {
                map_1.put(arr[i], i);
                arrlist.add(arr[i]) ;
            }
            else
            {
                 map_1.replace(arr[i] , i);
            }
        }
            // Create a list from elements of HashMap
            List<Map.Entry<Integer, Integer>> list = new LinkedList<Map.Entry<Integer, Integer>>(map_1.entrySet());

            // Sort the list
            Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
                public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                    return (o1.getValue()).compareTo(o2.getValue());
                }
            });

            // put data from sorted list to hashmap
            HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>();
            for (Map.Entry<Integer, Integer> aa : list) {
                temp.put(aa.getKey(), aa.getValue());
            }
            return temp;
        }


    }


//    private static int[] mikeHash(int[] arr ) {
//          int max  = arr[0] ,count = 0;
//        for (int i = 1; i <arr.length ; i++) {
//            if (arr[i] > max)
//            {
//                max = arr[i] ;
//            }
//        }
//        int hash[] = new int[max+1];
//        for (int i = 0; i <hash.length ; i++) {
//            hash[i]=-1 ;
//        }
//
//        for (int i = 0; i <hash.length ; i++) {
//            if (hash[arr[i]]==-1)
//            {
//                hash[arr[i]] = count ;
//                count++ ;
//                continue;
//            }
//            for (int j = 0; j <i ; j++) {
//                if (hash[arr[j]] >hash[arr[i]])
//                {
//                    hash[arr[j]]--;
//                }
//
//            }
//            hash[arr[i]] = count - 1;
//        }
//        return hash ;
//    }

