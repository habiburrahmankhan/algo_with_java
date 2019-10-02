package trees.heap;

public class HeapClient {
    public static void main(String[] args) {
        Heap heap = new Heap();
        heap.addNode(10);
        heap.display();
        heap.addNode(20);
        heap.addNode(30);
        heap.addNode(40);
        heap.addNode(50);
        heap.addNode(60);
        heap.display();
        System.out.println(heap.remove());
        System.out.println(heap.remove());
        System.out.println(heap.remove());
        System.out.println(heap.remove());
        System.out.println(heap.remove());
        System.out.println(heap.remove());
        System.out.println(heap.remove());

    }
}
