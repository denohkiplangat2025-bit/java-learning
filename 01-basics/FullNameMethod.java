public class Main {
    public static void main(String[] args) {

        // method = a block of reusable code that is executed when called

        String fullName = getFullName("Dennis", "Kiplangat", "Chepkwony");
        System.out.println(fullName);
        }
        static String getFullName(String firstName, String midletName, String lastName) {
        return firstName+" "+midletName+" "+lastName;
        }
    }
