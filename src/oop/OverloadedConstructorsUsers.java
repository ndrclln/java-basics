package oop;

public class OverloadedConstructorsUsers {

    String username;
    String email;
    int age;

    OverloadedConstructorsUsers() {
        this.username = "Guest";
        this.email = "Not Provided";
        this.age = 0;
    }


    OverloadedConstructorsUsers(String username){
        this.username = username;
        this.email = "Not Provided";
        this.age = 0;
    }

    OverloadedConstructorsUsers(String username, String email){
        this.username = username;
        this.email = email;
        this.age = 0;
    }

    OverloadedConstructorsUsers(String username, String email, int age){
        this.username = username;
        this.email = email;
        this.age = age;
    }

}
