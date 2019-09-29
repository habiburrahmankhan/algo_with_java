package lecture_14;

public class list {
    public static void main(String[] args) {
        arraylist al = new arraylist() ;
        dyanamicstack ds =new dyanamicstack() ;
        dyanamicqueue dq = new dyanamicqueue();
        al.add(11);
        al.add(23);
        al.remove();
        for (int i = 0; i <100 ; i++) {
            al.add(i);
        }

        al.display();
        System.out.println();
        try {
            al.set(1, 55);
            System.out.println(al.get(1));
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        for (int i = 0; i <100 ; i++) {
            ds.push(i);
        }
        for (int i = 0; i <100 ; i++) {
            dq.enqueue(i);
        }

        System.out.println(ds.peek());
        System.out.println();
        System.out.println();
        System.out.println("fdfff");
        System.out.println();
        System.out.println();
        dq.display();


    }
}
