public class Main {
    public static void main(String[] args) {
        // HOW TO CREATE AN ARRAY OF OBJECTS IN JAVA

        Gari gari1 = new Gari("Mustang", "Red");
        Gari gari2 = new Gari("Charger", "Yellow");
        Gari gari3 = new Gari("Corvette", "Blue");

        Gari[] magari = {gari1, gari2, gari3};

        /* Gari[] magari = {new Gari("Mustang", "Red"),
                         new Gari("Corvette", "Blue"),
                         new Gari("Charger", "Yellow")}; */  // annonymous objects


        /* for(int i = 0; i < magari.length; i++){
            magari[i].drive();
        } */

        for(Gari gari : magari){
            gari.drive();
        }

    }
}
