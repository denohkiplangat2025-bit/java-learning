import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // While loop = repeats some code forever while some conditions remains true


        Scanner scanner = new Scanner(System.in);
      
        int age = 0;

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        while (age < 0){
            System.out.println("Your age CAN'T be negative");
            System.out.print("Enter your age: ");
            age = scanner.nextInt();
        }
        System.out.println("Your age is " + age + " years old");

        scanner.close();

    }
}
