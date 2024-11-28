import java.util.*;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student(23,"Sandip",67));
        students.add(new Student(23 ,"Ajay",60));
        students.add(new Student(22,"Suraj",87));
        students.add(new Student(4,"Advait",20));

//        Collections.sort(students, new ageComparator());

//        Collections.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//
//                return o1.age-o2.age;
//            }
//        });

        //lambda function
        Collections.sort(students, ( o1,  o2) ->  o2.weight-o1.weight);



        System.out.println(students);
    }
}