package basics;

public class MathClass {
    public static void main(String[] args){
        // PRINT SPECIFIC NUMBER OF DECIMAL
        // System.out.printf("... %.1funit", varName);

        //Value of pi
        System.out.println("VALUE OF PI");
        System.out.println(Math.PI);

        //Value of Euler's number
        System.out.println("\nVALUE OF Euler's number");
        System.out.println(Math.E);

        // Exponent (base, exponent)
        double result;
        result = Math.pow(2, 3);
        System.out.println("\nEXPONENT");
        System.out.println(result);

        // Absolute value
        double result1;
        result1 = Math.abs(-6);
        System.out.println("\nABSOLUTE VALUE");
        System.out.println(result1);

        // Square root
        double result2;
        result2 = Math.sqrt(9);
        System.out.println("\nSQUARE ROOT");
        System.out.println(result2);

        // Rounding
        double result3;
        result3 = Math.round(3.64);
        System.out.println("\nROUNDING");
        System.out.println(result3);

        // Rounding up (ceiling)
        double result4;
        result4 = Math.ceil(2.5);
        System.out.println("\nROUNDING UP (CEILING)");
        System.out.println(result4);

        // Rounding down (flooring)
        double result5;
        result5 = Math.floor(2.5);
        System.out.println("\nROUNDING DOWN (FLOOR)");
        System.out.println(result5);

        // Max number
        double result6;
        result6 = Math.max(10, 20);
        System.out.println("\nMAX NUMBER");
        System.out.println(result6);

        // Min number
        double result7;
        result7 = Math.min(10, 20);
        System.out.println("\nMIN NUMBER");
        System.out.println(result7);
    }
}
