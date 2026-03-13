public class Main {
    public static void main(String[] args) {

        // Logical operators = they allow us to check or modify more than one condition

        // && = AND

        // || = OR

        // ! = NOT

        double temp = -10;
        boolean isSunny = true;

        if (temp <= 30 && temp >= 20 && isSunny) {
            System.out.println("The weather is GOOD");
            System.out.println("It is SUNNY outside");

        } else if (temp <= 30 && temp >= 0 && !isSunny) {
            System.out.println("The weather is GOOD");
            System.out.println("It is CLOUDY outside");
        } else if (temp > 30 || temp < 0) {
            System.out.println("The weather is  BAD");


        }
    }
}
