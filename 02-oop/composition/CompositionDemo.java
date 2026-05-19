public class Main {
    public static void main(String[] args) {

        // Composition = Represents a "part-of" relationship between objects.
        //               for example, an Engine is "part of" a car.
        //               Allows complex objects to be constructed from smaller objects.

        Automobile automobile = new Automobile("Corvette", 2025,"V8");
        System.out.println(automobile.model);
        System.out.println(automobile.year);

        System.out.println(automobile.engine.type);
        automobile.start();
    }
}

