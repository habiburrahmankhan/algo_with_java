package hackerblock;

import java.time.Instant;
import java.util.*;

public class SortGame  {

    private static class employee implements Comparable<employee>  {
        int salary ;
        String name ;

       public employee(String name ,int salary )
        {
            this.name=name;
            this.salary=salary;
        }

        @Override
        public int compareTo(employee o1) {
            return o1.salary - this.salary;
        }

    }

    public static void main(String[] args) {
        ArrayList<employee> arr =new ArrayList<>();
        Scanner s = new Scanner(System.in);
        int range = s.nextInt();
        int n = s.nextInt();
        for (int i = 0; i <n ; i++) {
            String str = s.next();
            int sal = s.nextInt();
            employee e =new employee(str , sal);
            arr.add(e);
        }
        Collections.sort(arr ,employee::compareTo);
        Comparator<employee> com = new Comparator<employee>() {
            @Override
            public int compare(employee o1, employee o2) {
                if (o1.salary==o2.salary)
                {
                    return o1.name.compareTo(o2.name);
                }
                else
                {
                    return 0;
                }


            }
        };
        Collections.sort(arr,com);
        for (employee e:arr) {
            if (e.salary>=range) {
                System.out.println(e.name + " " + e.salary);
            }
        }
    }

}
//Eve 78
//Bob 99
//Suzy 86
//Alice 86