public class Main {
    public static void main(String[] args) {

        // method = a block of reusable code that is executed when called

        int age = 27;
        if (age >= 18){
            System.out.println("You may sign up! ");
        }
        else {
            System.out.println("You must be 18+ to sign up! ");
        }
        }
        static boolean ageCheck(int age){
        if(age >= 18){
            return true;
        }
        else{
            return false;
        }
        }
    }
