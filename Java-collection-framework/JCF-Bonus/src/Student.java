public class Student implements Comparable<Student>{
    public int age;
    public String name;
    public int weight;

    public Student(int age, String name, int weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    @Override
    public int compareTo(Student that) {
        //tihs method called for current object
        //we will define our sorting logic

        //sort basis on age
        //asending
        if (this.age == that.age){
            return this.name.compareTo((that.name));
        }
        return this.age - that.age;
        //desending
//        return that.weight-this.weight;

    }



}
