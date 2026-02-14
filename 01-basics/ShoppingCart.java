import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // SHOPPING CART PROGRAM

         Scanner scanner = new Scanner(System.in);
         String item;
         double price;
         int quantity;
         char currency ='$';

        System.out.print("What item would you like to buy?: ");
        item = scanner.nextLine();

        System.out.print("What is the price of each item?: " );
        price = scanner.nextDouble();

        System.out.print("How many items would you like to buy?: ");
        quantity = scanner.nextInt();

        double total = price * quantity;
        System.out.println("\nYou have bought "+ quantity + "" + item + "/s");
        System.out.println("Your total is "+ currency + total);

        scanner.close();


    }
}
