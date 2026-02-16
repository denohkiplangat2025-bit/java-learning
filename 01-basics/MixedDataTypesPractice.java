import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // if statement= performs a block of code if its conditions is true

        Scanner scanner = new Scanner(System.in);
        String name;
        int age;
        boolean isStudent;


        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.print("Enter your Age: ");
        age = scanner.nextInt();

        System.out.print("Are you a student (true/false)? ");
        isStudent = scanner.nextBoolean();

        // GROUP 1
        if(name.isEmpty()){
            System.out.println("You didn't enter your name! 😔😔");
        }
        else{
            System.out.println("Your name is "+ name + "!");
        }
        // GROUP 2
        if(age >= 65){
            System.out.println("You are a Senior! ");
        }
        else if(age >= 18){
            System.out.println("You are an Adult! ");
        }
        else if(age < 0) {
            System.out.println("You haven't been Born yet! ");
        }
        else if(age == 0){
            System.out.println("You are a Baby! ");
        }
            else{
                System.out.println("You are a Child! ");
        }
            // GROUP 3

        if(isStudent){
            System.out.println("You are a Student! ");
        }
        else{
            System.out.println("You are NOT a Student! ");
        }
            scanner.close();
        }
}
