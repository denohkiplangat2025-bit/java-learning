public class Main {
    public static void main(String[] args) {
        // Overload constructors = allow a class to have multiple constructors with different parameter lists
        //                         Enable objects to be initialized in various ways

        User user1 = new User("Dennis");
        User user2 = new User("Daniel","PStar@aol.com");
        User user3 = new User("Daniel","SChecks@gmail.com", 27);


        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);

        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);

        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);
    }
}
public class User {
    String username;
    String email;
    int age;

    User(String username){
        this.username = username;
        this.email = "Not provided";
        this.age = 0;
    }
    User(String username, String email){
        this.username = username;
        this.email = email;
        this.age = 0;
    }
    User(String username, String email, int age){
        this.username = username;
        this.email = email;
        this.age = age;
    }
}
