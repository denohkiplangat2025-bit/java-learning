import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // JAVA SLOT MACHINE

        // DECLARE VARIABLES
        // DISPLAY WELCOME MESSAGE
        // PLAY IF BALANCE > 0
        // ENTER BET AMOUNT
        //                 VERIFY IF BETAMOUNT > BALANCE
        //                 VERIFY IF BETAMOUNT > 0
        //                 SUBTRACT BETAMOUNT FROM BALANCE
        // SPIN ROW
        // PRINT ROW
        // GET PAYOUT
        // ASK TO PLAY AGAIN
        // DISPLAY EXIT MESSAGE

        Scanner scanner = new Scanner(System.in);

        int balance = 100;
        int betAmount;
        int payout;
        String[] row;
        String playAgain;

        System.out.println("*************************");
        System.out.println("Welcome to JAVA SLOTS");
        System.out.println("Symbols: 🍒 🍉 🍋 🔔 ⭐");
        System.out.println("*************************");

        while(balance>0){
            System.out.println("Current balance: " + balance);
            System.out.print("Place your Bet amount: ");
            betAmount = scanner.nextInt();
            scanner.nextLine();

            if(betAmount > balance){
                System.out.println("INSUFFICIENT FUNDS! ");
                continue;
            }
            else if(betAmount <= 0){
                System.out.println("BET AMOUNT must be greater than 0.! ");
                continue;
            }
            else{
               // balance = balance - betAmount;
                balance -= betAmount;
            }
            System.out.println("Spinning...");
            row = spinRow();
            printRow(row);
            payout = getPayout(row, betAmount);

            if(payout > 0){
                System.out.println("You won: $" + payout);
               // balance =  balance + payout;
                balance += payout;
            }
            else{
                System.out.println("Sorry you lost this round!😔");
            }
            System.out.print("Do you want to play again?(Y/N): ");
            playAgain = scanner.next().toUpperCase();

            if(!playAgain.equals("Y")){
                break;
            }
        }
        System.out.println("GAME OVER! Your final balance is: $ " + balance);

        scanner.close();

    }
    static String[] spinRow(){
        String[] symbols = {"🍒", "🍉", "🍋", "🔔", "⭐"};
        String[] row = new String[3];
        Random random = new Random();


        for(int i = 0; i < 3; i++){
            row[i] = symbols[random.nextInt(symbols.length)];
        }

        return row;
    }
    static void printRow(String[] row){
        System.out.println("************************************");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("***********************************");
    }
    static int getPayout(String[] row, int betAmount){

        if(row[0].equals(row[1]) && row[1].equals(row[2])){

            return switch (row[0]){
                case "🍒" -> betAmount * 3;
                case "🍉" -> betAmount * 4;
                case "🍋" -> betAmount * 5;
                case "🔔" -> betAmount * 10;
                case "⭐" -> betAmount * 20;
                default -> 0;

            };

        }
        else if(row[0].equals(row[1])){

            return switch (row[0]){
                case "🍒" -> betAmount * 2;
                case "🍉" -> betAmount * 3;
                case "🍋" -> betAmount * 4;
                case "🔔" -> betAmount * 5;
                case "⭐" -> betAmount * 10;
                default -> 0;

            };

        }
        else if(row[1].equals(row[2])){

            return switch (row[1]){
                case "🍒" -> betAmount * 2;
                case "🍉" -> betAmount * 3;
                case "🍋" -> betAmount * 4;
                case "🔔" -> betAmount * 5;
                case "⭐" -> betAmount * 10;
                default -> 0;

            };

        }
        return 0;
    }
}
