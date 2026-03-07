
public class Main {
    public static void main(String[] args) {

        // ternary operator ? = Return 1 of values if a condition is True

        // variable = (condition) ? ifTrue : ifFalse;

        /* int score = 95;

        String passOrFail = (score >= 60) ? "PASS" : "FAIL";

        System.out.println(passOrFail);

        int number = 3;
        String evenOrOdd = (number % 2 == 0) ? "EVEN" : "ODD";
        System.out.println(evenOrOdd);

        int hours = 11;
        String timeOfDay = (hours >= 12) ? "PM" : "AM";

        System.out.println(timeOfDay); */

        int income = 5000;
        double taxRate = (income >= 40000) ? 0.25 : 0.15;
        System.out.println(taxRate);

    }
}
