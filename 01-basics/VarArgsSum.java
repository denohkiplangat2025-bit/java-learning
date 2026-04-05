public class Main {
    public static void main(String[] args) {
        // varargs = allow a method to accept a varying number of arguments
        //            makes methods more flexible , no need for overloaded methods
        //            java will pack the arguments into an array... (ellipses)

        System.out.println(add(1,2,3,4,5,6,7,8,9));

    }
    static int add(int... numbers){

        int sum = 0;
        for(int number : numbers){
            sum += number;
        }
        return sum;
    }
}
