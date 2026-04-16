public class Main {
    public static void main(String[] args) {
        // Constructor = A special method to initialize objects
        //               You  can pass arguments to a constructor and set up initial values

        Student student1 = new Student("Dennis", 26, 3.7);
        Student student2 = new Student("Duncan", 25, 3.7);


        /*System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled);

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student2.isEnrolled); */

        student1.study();
        student2.study();


    }
}
public class Student {
    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = false;
    }
    void study(){
        System.out.println(this.name + " is studying");
    }
}

