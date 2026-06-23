package basics;

public class Operators {
    public static void main(String[] args){
        // ARITHMETIC OPERATORS
        // Addition (+)         | z = x + y;
        // Subtraction (-)      | z = x - y;
        // Multiplication (*)   | z = x * y;
        // Division (/)         | z = x / y;
        // Modulo (%)           | z = x % y;

        // AUGMENTED ASSIGNMENT OPERATORS
        // Addition (+=)        | x = x + y -> x += y
        // Subtraction (-=)     | x = x - y -> x -= y
        // Multiplication (*=)  | x = x * y -> x *= y
        // Division (/=)        | x = x / y -> x /= y
        // Modulo (%/)          | x = x % y -> x %= y

        // INCREMENT AND DECREMENT OPERATORS
        // Increment (++)
        // Decrement (--)

        // ORDER OF OPERATIONS [P-E-M-D-A-S]
        // 1. Parenthesis
        // 2. Exponent
        // 3. Multiplication
        // 4. Division
        // 5. Addition
        // 6. Subtraction

        int x = 10;
        int y = 2;
        int z;

        z = x + y;

        double result = 3 + 4 * (7 - 5) / 2.0;

        System.out.println(z);
        System.out.println(result);

    }
}
