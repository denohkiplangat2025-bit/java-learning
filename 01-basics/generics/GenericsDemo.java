public class Main {
    public static void main(String[] args) {
        // Generics = A concept where you can write a class, interface, or method that is compatible with different
        //            data types.
        //            <T> type parameter(placeholder that gets replaced with a real type)
        //            <String> type argument(specifies the type)

        Box<String> box1 = new Box<>();
        Box<Integer> box2 = new Box<>();
        Box<Double> box3 = new Box<>();


        box1.setItem("Banana");
        box2.setItem(5);
        box3.setItem(3.142);

        System.out.println(box1.getItem());
        System.out.println(box2.getItem());
        System.out.println(box3.getItem());

    }
}
