import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // HYPONUSE c = Math.sqrt(a2 + b2)

        Scanner scanner=new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.print("Enter the legth of A: ");
        a=scanner.nextDouble();

        System.out.print("Enter the legth of B: ");
        b=scanner.nextDouble();

        c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.println("The hypotenuse of (side C) is: " + c + "cm");

        scanner.close();
    }
}
