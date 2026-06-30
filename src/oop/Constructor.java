package oop;

// constructors     = A special method to initialize objects
//                    You can pass arguments to a constructors
//                    and set up initial values

public class Constructor {
    public static void main (String[] args){

        //                                                  (parameter same to the constructors )
        ConstructorStudent student1 = new ConstructorStudent("SpongeBob", 30, 3.2);
        ConstructorStudent student2 = new ConstructorStudent("Patrick", 24, 1.5);
        ConstructorStudent student3 = new ConstructorStudent("Sandy", 27, 4.0);

        System.out.println("STUDENT 1");
        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled);
        student1.study();

        System.out.println("\nSTUDENT 2");
        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student2.isEnrolled);
        student2.study();

        System.out.println("\nSTUDENT 3");
        System.out.println(student3.name);
        System.out.println(student3.age);
        System.out.println(student3.gpa);
        System.out.println(student3.isEnrolled);
        student3.study();


    }
}
