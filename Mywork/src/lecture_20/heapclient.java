package lecture_20;

public class heapclient {
    public static void main(String[] args) {
        heap<Integer> heap = new heap<>();
        heap.insert(15);
        heap.insert(20);
        heap.insert(30);
        heap.insert(2);
        heap.display();
        System.out.println( heap.remove() ) ;
        System.out.println( heap.remove() ) ;
        System.out.println( heap.remove() ) ;
    }
}
