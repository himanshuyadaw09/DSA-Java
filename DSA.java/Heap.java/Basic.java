import java.util.PriorityQueue;
import java.util.Collections;

public class Basic {
    public static void main(String[] args) {
        // Min Heap
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // // Max Heap
        // PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(10);
        pq.add(20);
        pq.add(-30);
        System.out.println(pq.peek());
        System.out.println(pq);
        System.out.println(pq.remove());
        System.out.println(pq);
    }
    
}
