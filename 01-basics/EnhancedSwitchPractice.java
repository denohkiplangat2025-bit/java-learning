import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Enhanced switch = A replacement to many else if statements (java14 feature)

        /*String day = "Pizzaday";

        switch (day) {
            case "Monday" -> System.out.println("It is a weekday");
            case "Tuesday" -> System.out.println("It is a weekday");
            case "Wednesday" -> System.out.println("It is a weekday");
            case "Thursday" -> System.out.println("It is a weekday");
            case "Friday" -> System.out.println("It is a weekday");
            case "Saturday" -> System.out.println("It is a weekday");
            case "Sunday" -> System.out.println("It is a weekday");
            default -> System.out.println(day + " is not a day");
        }

         */
        String day;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter day: ");
        day = scanner.nextLine();

        switch (day){
            case "Monday", "Tuesday", "Wednesday", "Thursday",
                 "Friday" -> System.out.println("It is a Weekday");
            case "Saturday", "Sunday" -> System.out.println("It is a Weekend");
            default -> System.out.println(day + " is not a valid day");

        }
        scanner.close();
    }
}
