public class Main {
    public static void main(String[] args) {

        // overload methods = methods that share the same name, but different parameters
        //      signature = name + parameters

        System.out.println(add(4,5, 9, 9));
        }
        static double add(double a, double b){
        return a+b;
        }
        static double add(double a, double b, double c){
        return a+b+c;
        }
        static double add(double a, double b, double c, double d){
        return a+b+c+d;
        }
    }
