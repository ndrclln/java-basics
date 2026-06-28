package basics;

public class ArrayMultidimensional {
    public static void main(String[] args){

        // 2D array/ Multi-Dimensional array = An array where each element is an array
        //                                     Useful for storing a matrix of data

        //String[] fruits = {"Apple", "Orange", "Banana"};
        //String[] vegetable = {"Potato", "Onion", "Carrot"};
        //String[] meats = {"Chicken","Pork", "Beef", "Fish" };

        String[][] groceries = { {"Apple", "Orange", "Banana"}
                                ,{"Potato", "Onion", "Carrot"}
                                ,{"Chicken","Pork", "Beef", "Fish" }};

        System.out.println("Before:");
        for(String[] items: groceries){
            // System.out.println(items); Only show the address
            for (String item : items){
                System.out.print(item + " ");
            }
            System.out.println();
        }

        //To replace
        //groceries[row][column];
        groceries[0][0] = "Pineapple";
        groceries[1][2] = "Celery";
        groceries[2][2] = "Eggs";

        System.out.println("After:");
        for(String[] items: groceries){
            // System.out.println(items); Only show the address
            for (String item : items){
                System.out.print(item + " ");
            }
            System.out.println();
        }

    }
}
