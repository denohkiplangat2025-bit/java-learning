public class Main {
    public static void main(String[] args) {

        // method = a block of reusable code that is executed when called

        String name = "Infinite_7";
        int age = 26;
        happyBirthday(name, age);
        }
        static void happyBirthday(String name, int age) {
            System.out.printf("Happy Birthday to %s!\n ", name);
            System.out.printf("Happy Birthday dear %s!\n ", name);
            System.out.printf("You are %d years old!\n ", age);
            System.out.printf("Happy Birthday %s once more!\n ", name);
        }
    }
