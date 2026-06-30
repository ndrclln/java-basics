package oop;

public class StaticFriend {

    static int numOfFriends; // They will all share; All object has access to this
    String name;

    StaticFriend(String name){
        this.name = name;
        numOfFriends++;
    }

    static void showFriend(){
        System.out.println("You have " + numOfFriends + " total friends"); // No need the "this".
    }
}
