package basics;

public class Varargs {
    public static void main(String[] args){

        // varargs = allow a method to accept a varying # of arguments
        //           makes methods more flexible, no need for overloaded methods (shared same name with diff. arguments)
        //           java will pack the arguments into an array
        //           ... (ellipsis

        System.out.println("Add: "+ add(1,2,3,4,5,6));
        System.out.println("Average: "+ average(1,2,3,4,5,6));

    }

    static int add(int... numbers){

        int sum = 0;

        for(int number: numbers){
            sum += number;

        }
        return sum;
    }

    static double average(double... numbers){

        double sum = 0;

        for(double number : numbers){
            sum += number;
        }

        return sum / numbers.length;
    }
}
