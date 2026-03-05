import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // WEIGHT CONVERSION PROGRAM

        // Declare variables

        // welcome message

        // prompt for user choice

        // option 1 convert lbs to kgs

        // option 2 covert kgs to lbs

        // else print not a valid choice

        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("Weight Conversion Program!");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");

        System.out.print("Choose an option: ");
        choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter weight in lbs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("The new weight in KGS is: %.2f", newWeight);
        }
        else if (choice == 2) {
            System.out.print("Enter weight in kgs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("The new weight in LBS is: %.2f", newWeight);
        }

        else {
            System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
