public class Student {
    //attributes
    public int id;
    public int age;
    public int nos;
    public String name;

    //default constructor
    public Student(){
        System.out.println("default ctor called....");
    }

    //parametrized constructor
    public Student(int id, int age, String name, int nos){
        System.out.println("parametrized ctor called....");

        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
    }

    //copy constructor
    public String (Student srcobj)

    //methods / behaviour

    public void study(){
        System.out.println(name + " Studying...");
    }

    public void sleep(){
        System.out.println(name + " sleeping...");
    }

    public void bunk(){
        System.out.println(name + " bunking...");
    }
}
