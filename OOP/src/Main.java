//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Student A = new Student();
//        A.id =1;
//        A.age = 22;
//        A.name = "Sandy";
//        A.nos = 5;
//        System.out.println(A.id);
//        System.out.println(A.age);
//        System.out.println(A.name);
//        System.out.println(A.nos);

        Student B = new Student(1,22,"sandy", 5);
        System.out.println(B.id);
        System.out.println(B.age);
        System.out.println(B.name);
        System.out.println(B.nos);

        B.sleep();
        B.study();
        B.bunk();
    }
}