import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // array = a collection of values of the same data types
        //      * think of it es a variable that can store more than 1 value *

        String[] fruits = {"apple","orange","banana","coconut"};
        //fruits[0] = "pineapple";
        //int numOfFruits = fruits.length;
        //Arrays.sort(fruits);
        //Arrays.fill(fruits, "apple");

        //System.out.println(fruits[0]);
        //System.out.println(numOfFruits);

        /*
        for(int i = 0; i < fruits.length; i++){
            System.out.print(fruits[i] + " ");
        }
        */
        // ENHANCED/ FOR EACH LOOP
        for(String fruit : fruits){
            System.out.println(fruit);
        }

    }
}
