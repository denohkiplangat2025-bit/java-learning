public class Main {
    public static void main(String[] args) {

        // ANONYMOUS CLASS = A class that does not have a name.
        //                   Cannot  be reused.
        //                  Add custom behavior without having to create a new class.
        //                  Often used for one time uses (TimerTask, Runnable, callbacks )

        Pleite pleite1 = new Pleite();
        Pleite pleite2 = new Pleite(){
            @Override
            void speak(){
                System.out.println("Scooby goes *Ruh Roh*");
            }
        };

        pleite1.speak();
        pleite2.speak();
    }
}
