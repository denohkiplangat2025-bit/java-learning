public class Main {
    public static void main(String[] args) {

        // Wrapper classes = Allow primitive values (int, char, double, boolean) to be used as objects .
        //                   "Wrap them in an object". Generally, don't wrap primitives unless you need an object.
        //                    Allows use of collections Framework and static Utility Methods .

        // Autoboxing
       //Integer a = 123;
       // Double b = 3.14;
        //Character c = '$';
       // Boolean d = true;

        // Unboxing
        //int x = a;
        //double x = b;
        //char x = c;
        //boolean x = d;

        //String a = Integer.toString(123);
        //String b = Double.toString(3.14);
        //String c = Character.toString('0');
        //String d = Boolean.toString(false);

        //String x = a + b + c + d;
        //System.out.println(x);

        int a = Integer.parseInt("123");
        double b = Double.parseDouble("3.14");
        char c = "Pizza".charAt(0);
        boolean d = Boolean.parseBoolean("true");

        char letter = 'b';
        System.out.println(Character.isLetter(letter));
        System.out.println(Character.isDigit(letter));
        System.out.println(Character.isLowerCase(letter));
        System.out.println(Character.isUpperCase(letter));


    }
}
