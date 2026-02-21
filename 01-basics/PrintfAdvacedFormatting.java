public class Main {
    public static void main(String[] args) {

        // printf = is a method used to format output
        // %[flags][width][.precision][specifier-character]
        // + = output a plus
        // , = comma grouping separator
        // ( = display a minus if negative, space if positive

        double price1 = 9.99;
        double price2 = 100.15;
        double price3 = -54.01;

        System.out.printf("%.3f\n", price1);
        System.out.printf("%.3f\n", price2);
        System.out.printf("%.3f\n", price3);

    }
}
