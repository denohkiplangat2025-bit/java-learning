import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // While loop = repeats some code forever while some conditions remains true

        Scanner scanner = new Scanner(System.in);

        String response = "";

        while (!response.equals("Q")){
            System.out.println("You are playing a Game");
            System.out.print("Enter Q to quit: ");
            response = scanner.next().toUpperCase();
        }
        System.out.println("You have quit the game! ");

        scanner.close();

    }
}
