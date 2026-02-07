import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // COMMON ISSUES

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your favourite color: ");
        String color = scanner.nextLine();

        System.out.println("Your are: " + age + " years old!");
        System.out.println("Your like the color: " + color);


        scanner.close();
    }
}
