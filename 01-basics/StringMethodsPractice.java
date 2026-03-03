public class Main {
    public static void main(String[] args) {

        // useful  String methods

        String name = "Dennis Chepkwony";
        int length = name.length();
        char letter = name.charAt(6);
        int index = name.indexOf("e");
        int lastIndex = name.lastIndexOf("e");

        //name = name.toUpperCase();
        //name = name.toLowerCase();
        //name = name.trim();
        //name = name.replace("n", "l");

        //System.out.println(name.isEmpty());
        /*
        if(name.isEmpty()){
            System.out.println("Your name is empty");
        }
        else{
            System.out.println("Your name is " + name);
        }


        if(name.contains(" ")) {
            System.out.println("Your name contains spaces");
        }
        else{
            System.out.println("Your name is " + name);
        }

         */
        if(name.equalsIgnoreCase("PasSword")){
            System.out.println("Your name CAN'T be  PasSword");
        }
        else{
            System.out.println("Your name is: " + name);
        }
    }
}
