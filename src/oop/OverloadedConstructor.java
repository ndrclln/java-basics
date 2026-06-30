package oop;

public class OverloadedConstructor {
    public static void main(String[] args){
        // overloaded constructors = Allow a class to have multiple constructors
        //                           with different parameter lists.
        //                           Enable objects to be initialized in various ways.

        OverloadedConstructorsUsers user4 = new OverloadedConstructorsUsers();
        OverloadedConstructorsUsers user1 = new OverloadedConstructorsUsers("Nobita");
        OverloadedConstructorsUsers user2 = new OverloadedConstructorsUsers("Doraemon", "doraemon@gmal.com");
        OverloadedConstructorsUsers user3 = new OverloadedConstructorsUsers("Shisuka", "shisuka@gmal.com", 27);


        System.out.println(user4.username);
        System.out.println(user4.email);
        System.out.println(user4.age);

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
