public class Main {
    static int x = 4; // CLASS
    public static void main(String[] args) {

        // variable scope = where a variable can be accessed
        // local variable = inside methods
        // class(instance/static)variable= outside methods

        int x = 1; // LOCAL
        System.out.println(x);
        doSomething();
        }
        static void doSomething(){
        int x = 6; // LOCAL
        System.out.println(x);
        }
    }
