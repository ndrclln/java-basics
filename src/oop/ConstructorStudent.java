package oop;

public class ConstructorStudent {

    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    // To set up a constructor
    ConstructorStudent(String name, int age, double gpa){
        // To assign attributes use "this"
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = true; // Not necessarily need to pass an argument
    }

    void study(){
        System.out.println(this.name + " is studying.");
    }
}
