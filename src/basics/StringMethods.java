package basics;

public class StringMethods {
    public static void main(String[] args){

        String name = "Endrea Collin";

        System.out.println(name);

        // length
        int length = name.length();
        System.out.println("The length of the name is " + length);

        // character at specific index -> .charAt(index)
        char letter = name.charAt(0);
        System.out.println("The character at index 0 is " + letter);

        // first index .indexOf("letter")
        int index = name.indexOf("e");
        System.out.println("The index of character e is " + index);

        // last index .lastIndexOf("letter")
        int lastIndex = name.lastIndexOf("l");
        System.out.println("The last index of character l is " + lastIndex);

        // UPPERCASE
        String upName = name.toUpperCase();
        System.out.println("The UPPERCASE of the " + name +" is " + upName);

        // lowercase
        String lowName = name.toLowerCase();
        System.out.println("The lowercase of the " + name +" is " + lowName);

        // Eliminate white spaces
        String white = "    I have white spaces    ";
        white = white.trim();
        System.out.println(white);

        // Replacing the letter -> .replace("letter to replace", "letter to put")
        name = name.replace("l", "s");
        System.out.println("I replace l with s: " +  name);


        // .isEmpty()
        // .contains(" ")
        // .equals(" ")
        // .equalsIgnoreCase(" ") = to ignore key sensitivity


    }
}
