import java.util.LinkedList;
import java.util.Queue;

public class QueueBasics {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        q.offer(50);

        System.out.println(q);

        q.offer(60);   // adds new element to  the queue if yes return true else false
        System.out.println(q);
        System.out.println(q.peek());  //head element
        q.remove();
        System.out.println(q);

    }
}
