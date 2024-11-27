import java.util.*;

public class StackClass {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println(st);

//        st.pop();
        System.out.println(st.peek());
        System.out.println(st.search(10));
        System.out.println(st.search(20));
        System.out.println(st.search(30));
        System.out.println(st.empty());
        System.out.println(st);
    }
}
