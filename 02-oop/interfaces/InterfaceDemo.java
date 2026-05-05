public class Main {
    public static void main(String[] args) {
     // Interface = A blueprint for a class that specifies a set of abstract methods that implementing class MUST
     //              define.
        //           Supports multiple inheritance-like behavior

        Rabit rabit = new Rabit();
        Hawk hawk = new Hawk();
        Fisch fisch = new Fisch();

        //rabit.flee();
        //hawk.hunt();
        //fisch.flee();
        fisch.hunt();
    }
}
