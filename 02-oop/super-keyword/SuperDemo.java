public class Main {
    public static void main(String[] args) {
        // Super = Refers to the parent class(subclass<-superclass)
        //         Used in constructors and method overriding
        //         Calls the parent constructor to initialize attributes

        Person person = new Person("Dennis", "Chepkwony");
        Learner learner = new Learner("Duncan","Chirchir", 3.4);
        Employee employee = new Employee("Enock","Kirui",4500);

       //person.showName();
        //learner.showName();
        //learner.showGPA();
        employee.showSalary();

    }
}
