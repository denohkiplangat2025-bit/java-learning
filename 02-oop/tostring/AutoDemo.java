public class Main {
    public static void main(String[] args) {
        // .toString() = Method inherited from the object class
        //               Used to return a string representation of an object.
        //               By default, it returns a hash code as a unique identifier .
        //               It can be overriden to provide meaningful details

        Auto auto1 = new Auto("Ford","Mustang",2025,"Red");
        Auto auto2 = new Auto("Chevrolet","Corvette",2026,"Blue");

        System.out.println(auto1);
        System.out.println(auto2);
    }
}
