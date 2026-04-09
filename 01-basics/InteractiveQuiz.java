import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // INTERACTIVE QUIZ GAME

        String[] questions = {"1. What is the main function of a Router? ",
                              "2. Which part of the computer is considered the Brain? ",
                              "3. What year was Facebook launched? ",
                              "4. Who is known as the father of computer? ",
                              "5. What was the first Programming language? "};

        String[][] options = {{"1. Storing files", "2. Encrypting data", "3. Directing internet traffic", "4. Managing passwords"},
                              {"1. CPU", "2. Hard Drive", "3. RAM", "4. GPU"},
                              {"1. 2000", "2. 2004", "3. 2006", "4. 2008"},
                              {"1. Steve Jobs", "2. Bill Gates", "3. Alan Turing", "4. Charles Babbage"},
                              {"1. COBOL", "2. C", "3. Fortran", "4. Assembly"} };

        int[] answers = {3, 1, 2, 4, 3};
        int score = 0;
        int guess;

        Scanner scanner = new Scanner(System.in);

        System.out.println("******************");
        System.out.println("Welcome to the main program");
        System.out.println("******************");

        for(int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);

            for(String option : options[i]) {
                System.out.println(option);
            }
            System.out.print("Enter YOUR guess: ");
            guess = scanner.nextInt();

            if(guess == answers[i]) {
                System.out.println("**********************");
                System.out.println("CORRECT! You guessed correctly!");
                System.out.println("**********************");
                score++;
            }
            else {
                System.out.println("**********************");
                System.out.println("INCORRECT! You guessed incorrectly!");
                System.out.println("**********************");
            }
        }
        System.out.println(" Your score is: " + score + " out of " + answers.length);
        scanner.close();

    }
}

