public class Main {
    public static void main(String[] args) {
        
        // Generics = A concept where you can write a class, interface, or method that is compatible with different
        //            data types.
        //            <T> type parameter(placeholder that gets replaced with a real type)
        //            <String> type argument(specifies the type)

        Product<String,Double> product1 = new Product<>("Iphone", 1.0);
        Product<String,Integer> product2 = new Product<>("Tablet", 700);

        System.out.println(product1.getItem());
        System.out.println(product1.getPrice());
        System.out.println(product2.getItem());
        System.out.println(product2.getPrice());
    }
}
