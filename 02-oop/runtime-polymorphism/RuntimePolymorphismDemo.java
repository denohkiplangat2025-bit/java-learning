import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     // Runtime polymorphism = when the method that gets executed is decided at runtime based on the actual type of
        //                     the object

        Scanner scanner = new Scanner(System.in);
        Tier tier;

        System.out.print("Would you like die Katze or einen Hund? (1= Katze, 2= Hund): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            tier = new Katze();
            tier.speak();
        }
        else if (choice == 2) {
            tier = new Hund();
            tier.speak();
        }
    }
}
