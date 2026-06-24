package basics;

public class Printf {
    public static void main(String[] args){
        // printf = method used to format output
        // %[flags][width][.precision][specifier-character]

        String name = "SpongeBob";
        char firstLetter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        // String (s)
        System.out.printf("Hello %s", name);

        // Character (c)
        System.out.printf("\nYour name starts with a %c", firstLetter);

        // Integer (d)
        System.out.printf("\nYou are %d years old", age);

        // Double (f)
        System.out.printf("\nYou are %f inches tall", height);

        // Boolean
        System.out.printf("\nEmployed: %b", isEmployed);

        // Multiple variables in one line
        System.out.printf("\n%s is %d years old", name, age);
        System.out.println("\n------------------------");

        // PRECISION
        double price1 = 90.99;
        double price2 = 10000.15;
        double price3 = -54.01;

        System.out.println("\nPRECISION");
        System.out.printf("%.1f", price1);
        System.out.printf("\n%.2f", price2);
        System.out.printf("\n%.3f", price3);
        System.out.println("\n------------------------");

        // FLAGS
        // + = output plus
        // , = comma grouping separator
        // ( = negative numbers are enclosed in ()
        // space = display a minus if negative, space if positive

        System.out.println("\nFLAGS");
        System.out.printf("%+.1f", price1);
        System.out.printf("\n%,.2f", price2);
        System.out.printf("\n%(.3f", price3);
        System.out.println();

        System.out.println("\nspace - for alignment");
        System.out.printf("% .1f", price1);
        System.out.printf("\n% .2f", price2);
        System.out.printf("\n% .3f", price3);
        System.out.println("\n------------------------");

        // WIDTH
        // 0numberof0toadd = zero padding -> 04 = 0001
        // number = right justified padding
        // negative number = left justified padding

        System.out.println("\nWIDTH");
        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.println("\n0");
        System.out.printf("%04d", id1);
        System.out.printf("\n%04d", id2);
        System.out.printf("\n%04d", id3);
        System.out.printf("\n%04d", id4);
        System.out.println();

        System.out.println("\nnumber");
        System.out.printf("%4d", id1);
        System.out.printf("\n%4d", id2);
        System.out.printf("\n%4d", id3);
        System.out.printf("\n%4d", id4);
        System.out.println();

        System.out.println("\n-number");
        System.out.printf("%-4d", id1);
        System.out.printf("\n%-4d", id2);
        System.out.printf("\n%-4d", id3);
        System.out.printf("\n%-4d", id4);


    }
}
