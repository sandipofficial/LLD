import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class ArrayDequeBasics {
    public static void main(String[] args) {
        Deque<Integer> q = new ArrayDeque<>();

        q.offer(30);
        q.offerFirst(40);
        q.offer(50);
        q.offerLast(60);

        System.out.println(q);

        q.offer(80);   // adds new element to  the queue if yes return true else false
        System.out.println(q);
        System.out.println(q.peek());  //head element
        q.pollLast();
        System.out.println(q);
        q.pollFirst();
        System.out.println(q);
    }
}
