package oop;

// static = Makes a variable or method belong to the class
//          rather than to any specific object.
//        = Commonly used for utility methods or shared resources.

public class Static {
    public static void main(String[] args){
        StaticFriend friend1 = new StaticFriend("Suneo");
        StaticFriend friend2 = new StaticFriend("Gian");
        StaticFriend friend3 = new StaticFriend("Shisuka");
        StaticFriend friend4 = new StaticFriend("Doraemon");
        StaticFriend friend5 = new StaticFriend("Nobita");

        System.out.println(StaticFriend.numOfFriends); // Access static by its class name

        StaticFriend.showFriend();

        // EXAMPLE OF UTILITY METHODS
        Math.round(3.99); // .round() = a utility method of Math class

    }

}
