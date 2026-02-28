import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Compound interest calculator

        double principal;
        double rate;
        int timeCompounded;
        int years;
        double amount;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        rate = scanner.nextInt();

        System.out.print("Enter the # number of times compounded per year: ");
        timeCompounded = scanner.nextInt();

        System.out.print("Enter the # of years: ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + rate/ 100, timeCompounded * years);
        System.out.printf("The amount after after %d years is $%.2f", years, amount);

    }
}
