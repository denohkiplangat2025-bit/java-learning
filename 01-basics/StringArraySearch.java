public class Main {
    public static void main(String[] args) {
        // how to search the element of an array

        String[] fruits = {"apple", "orange", "banana"};
        String target = "banana";
        boolean isFound = false;

        for(int i = 0; i < fruits.length; i++){
            if(fruits[i].equals(target)){
                System.out.println("Element found at index: " + i );
                isFound = true;
                break;
            }
        }
        if(!isFound){
            System.out.println("Element not found in the array! ");
        }

    }
}
