public class Auto {
    String makes;
    String model;
    int year;
    String color;
    Auto(String makes, String model, int year, String color) {
        this.makes = makes;
        this.model = model;
        this.year = year;
        this.color = color;
    }
    @Override
    public String toString() {
        return this.makes + " " + this.model + " " + this.year + " " + this.color;
    }
}
