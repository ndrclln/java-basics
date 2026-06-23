package basics;

public class Variable {

    public static void main(String[] args){
        // VARIABLES
            // Two steps in creating a variable
            // 1. Declaration - dataType varName;
            // 2. Assignment - dataType varName = something;

        System.out.println("VARIABLES (PRIMITIVE)");
        System.out.println("---------------");

        System.out.println("Integers (int)");
        int age = 19;
        System.out.println(age);
        System.out.println("My age in 2026 is " + age);
        System.out.println("---------------");

        System.out.println("Decimals (double)");
        double gwa = 1.00;
        double price = 30;
        System.out.println(gwa);
        System.out.println(price);
        System.out.println("My dream grade in OOP is " + gwa);
        System.out.println("---------------");

        System.out.println("Character (char)");
        char grade = 'A';
        System.out.println(grade);
        System.out.println("I'm manifest my grade in OOP is " + grade);
        System.out.println("---------------");

        System.out.println("Boolean (boolean)");
        boolean isPassed = true;
        System.out.println(isPassed);
        System.out.println("I'll get 1.00 in OOP? " + isPassed);
        System.out.println("---------------");

        System.out.println("VARIABLES (REFERENCE)");
        System.out.println("---------------");

        System.out.println("String (String)");
        String name = "Endrea";
        System.out.println(name);
        System.out.println("My name is " + name);
    }
}
