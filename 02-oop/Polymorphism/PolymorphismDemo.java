public class Main {
    public static void main(String[] args) {
     // Polymorphism = "POLY" = "MANY"
        //             "MORPH"="SHAPE"
        //            Objects can identify as another object.
        //            Objects can be treated as object of a common superclass

        Wagen wagen = new Wagen();
        Bike bike = new Bike();
        Boat boat = new Boat();
        //wagen.go();
        //bike.go();
        //boat.go();
        Vehicle[] vehicles = {wagen,bike,boat};
        for(Vehicle vehicle : vehicles){
            vehicle.go();
        }
    }
}
