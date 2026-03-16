import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = 0;

        while(number < 1 || number > 10){
            System.out.print("Enter a number between 1 and 10: ");
            number = scanner.nextInt();
        }
        System.out.println("You picked " + number);

        scanner.close();

    }
}
