public class Main {
    public static void main(String[] args) {

        // if statement= performs a block of code if its conditions is true

        int age = 0;

        if(age>=65) {
            System.out.println("You are a senior! ");

        }
        else if(age>=18) {
            System.out.println("You are a an Adult! ");
        }
        else if(age<0) {
            System.out.println("You haven't been Born yet!");
        }
        else if(age==0) {
            System.out.println("You are a Baby! ");
        }
        else {
            System.out.println("You are a Child ");
        }
