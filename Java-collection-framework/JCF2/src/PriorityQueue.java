import java.util.Queue;

public class PriorityQueue {
    public static void main(String[] args) {
        //by default minHeap
//        Queue<Integer> pq = new java.util.PriorityQueue<>();
        //for maxHeap comparator is used
        Queue<Integer> pq = new java.util.PriorityQueue<>((a,b)->b-a);

        pq.offer(40);
        pq.offer(30);
        pq.offer(10);
        pq.offer(20);

        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());

    }
}
