import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        // HashMap = A data structure that stores key-value pairs.
        //           Keys are unique, but Values can be duplicated.
        //           Does not maintain any order, but is memory efficient .
        //           HashMap<Key, Value>

        HashMap<String,Double> map = new HashMap<>();

        map.put("apple",0.5);
        map.put("orange",0.75);
        map.put("banana",1.0);
        map.put("pear",3.0);

       // map.put("orange",1.0);
        // map.remove("apple");
        //System.out.println(map.get("apple"));
        //System.out.println(map.containsKey("apple"));

        /* if(map.containsKey("apple")){
            System.out.println(map.get("apple"));
        }
        else {
            System.out.println("Key not found! ");
        }*/

        //System.out.println(map.containsValue(1.0));
        //System.out.println(map.size());
         for (String key : map.keySet()) {
             System.out.println(key + ": $" + map.get(key));
         }
    }
}
