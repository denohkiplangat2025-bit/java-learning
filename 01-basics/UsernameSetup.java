import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Using Logical Operators to evaluate the USERNAME when someone tries to set up Username

        // && = AND

        // || = OR

        // ! = NOT

        Scanner scanner = new Scanner(System.in);
        // username must be between 8-12 characters
        // username must not contain spaces or underscores

        String username;

        System.out.print("Enter your new username: ");
        username = scanner.nextLine();

        if (username.length() < 8 || username.length() > 12) {
            System.out.println("username must be between 8 and 12 characters");
        }
        else if(username.contains(" ") || username.contains("_")) {
            System.out.println("username cannot contain spaces or underscores");
        }
        else {
            System.out.println("Welcome " + username);
        }

        scanner.close();

    }
}
