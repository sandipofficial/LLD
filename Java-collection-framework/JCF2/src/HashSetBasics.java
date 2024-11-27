import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetBasics {
    public static void main(String[] args) {
        //HashSet --> o(1)
        //LinkedHashSet --> o(n)
        //TreeSet --> BST --> o(logn)
        //doesn't preserve order
//        Set<Integer> st1 = new HashSet<>();
//        Set<Integer> st2 = new HashSet<>();
        // preserve order
//        Set<Integer> st1 = new LinkedHashSet<>();
//        Set<Integer> st2 = new LinkedHashSet<>();

//        Set<Integer> st1 = new TreeSet<>();
//        Set<Integer> st2 = new TreeSet<>();

//
//        st1.add(10);
//        st1.add(20);
//        st1.add(30);
//        st1.add(40);
//
//        st2.add(30);
//        st2.add(40);
//        st2.add(50);
//        st2.add(60);
//
//        System.out.println(st1);
//        System.out.println(st2);
        //stores intersection
//        st1.retainAll(st2);
//        System.out.println(st1);
//        System.out.println(st1.containsAll(st2 ));
//        System.out.println(st2.containsAll(st1));

        //in custom object you need to override equals and hashcode function
        HashSet<Student> set = new HashSet<>();

        Student s1 = new Student(1,"Sandip");
        Student s2 = new Student(2,"Sandip");
        Student s3 = new Student(1,"Sandip");

        set.add(s1);
        set.add(s2);
        set.add(s3);

        System.out.println(set);


    }
}
