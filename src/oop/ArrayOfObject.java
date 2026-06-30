package oop;

public class ArrayOfObject {
    public static void main(String[] args){
        /*
        ArrayOfObjectCar car1 = new ArrayOfObjectCar("Mustang", "Red");
        ArrayOfObjectCar car2 = new ArrayOfObjectCar("Corvette", "Blue");
        ArrayOfObjectCar car3 = new ArrayOfObjectCar("Charger", "Yellow");

        //ArrayOfObjectCar[] cars = new ArrayOfObjectCar[3]; // empty
        ArrayOfObjectCar[] cars = {car1, car2, car3};

        for(int i = 0; i < cars.length; i++){
            cars[i].drive();
        }

        for(ArrayOfObjectCar car : cars){
            car.drive();
        }*/

        // PASSING ANONYMOUS OBJECT

        ArrayOfObjectCar[] cars = {new ArrayOfObjectCar("Mustang", "Red"),
                                   new ArrayOfObjectCar("Corvette", "Blue"),
                                   new ArrayOfObjectCar("Charger", "Yellow")
                                  };

        for(ArrayOfObjectCar car : cars) {
            car.drive();
        }

        System.out.println();
        // CHANGING ATTRIBUTE
        for(ArrayOfObjectCar car : cars) {
            car.color = "black";
        }
        for(ArrayOfObjectCar car : cars) {
            car.drive();
        }


    }
}
