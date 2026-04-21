public class Gari {
    String model;
    String color;

    Gari(String model, String color){
        this.model = model;
        this.color = color;
    }
      void drive(){
        System.out.println("You drive the " + this.model + " " + this.color);
      }
}
