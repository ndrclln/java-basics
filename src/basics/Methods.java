package basics;

public class Methods {
    public static void main(String[] args){
        // methods = block of reusable code that is executed when called ()

        String name = "Endrea";
        int age = 19;

        // TO CALL
        //            (arguments)
        happyBirthday(name, age);

        double result = square(3);
        System.out.println(result);

        String fullName = getFullName("Endrea", "Castillo");
        System.out.println(fullName);

        if(ageCheck(age)){
            System.out.println("You may sign-up");
        }else {
            System.out.println("You must be 18+");
        }

    }

    // METHOD DEFINITION
    //                      (parameters)
    static void happyBirthday(String name, int age){
        System.out.println("Happy Birthday to you!");
        System.out.printf("Happy Birthday dear %s!\n", name);
        System.out.printf("You are %d years old!\n", age);
        System.out.println("Happy Birthday to you! \n");
    }

    static double square(double number){
        return number * number;
    }

    static String getFullName(String firstName, String lastName){
        return firstName + " " + lastName;
    }

    static boolean ageCheck(int age){
        if(age >= 18){
            return true;
        }else {
            return false;
        }
    }
}
