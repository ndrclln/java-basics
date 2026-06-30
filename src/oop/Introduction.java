package oop;

// Object   = An entity that holds data (attributes)
//            and can perform actions (methods)
// Example  = Object           : Person
//          = Data/ Attributes : Name; Age; Height;
//          = Actions/ Methods : eat(); run();
//          = It is a reference data type
//          = We store the data of an object in a location called heap
// Class    = A blueprint to create an object


//      See IntroductionCar
public class Introduction {
    public static void main(String[] args){

        // To Create an Object:
        IntroductionCar introductionCar = new IntroductionCar();
        System.out.println(introductionCar); // OUTPUT: oop.IntroductionCar@5f184fc6 (a memory address)

        // To modify the attribute
        //introductionCar.isRunning = true;

        System.out.println("\nATTRIBUTES");
        // . operator = allows you to access things within an object;
        System.out.println(introductionCar.model);
        System.out.println(introductionCar.make);
        System.out.println(introductionCar.year);
        System.out.println(introductionCar.price);
        System.out.println(introductionCar.isRunning);

        System.out.println("\nMETHODS");
        System.out.println(introductionCar.isRunning);
        introductionCar.start();
        System.out.println(introductionCar.isRunning);
        introductionCar.stop();
        System.out.println(introductionCar.isRunning);

        System.out.println();
        introductionCar.drive();
        introductionCar.brake();

    }

}
