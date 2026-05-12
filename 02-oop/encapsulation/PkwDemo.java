import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // GETTERS = methods that make a field READABLE
       // SETTERS = methods that make a field WRITEABLE
       //             They help protect object data and add rules for accessing or modifying them.


        Pkw pkw = new Pkw("Charger", "Yellow", 10000);
        pkw.setColor("Blue");
        pkw.setPrice(0);
        System.out.println(pkw.getColor() + " " + pkw.getModel() + " " + pkw.getPrice());

    }
}
