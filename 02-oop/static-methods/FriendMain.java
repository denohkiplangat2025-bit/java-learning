public class Main {
    public static void main(String[] args) {
        // Static = Makes a variable or method belong to the class rather than to any specific object
        //           commonly used for utility methods or shared resources.


        Friend friend1 = new Friend("Duncan");
        Friend friend2 = new Friend("Leonard");
        Friend friend3 = new Friend("Daniel");
        Friend friend4 = new Friend("Anthony");


        //System.out.println(Friend.numOfFriends);
        Friend.showFriends();

    }
}
