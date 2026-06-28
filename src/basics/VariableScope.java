package basics;

public class VariableScope {

    static int x = 3; // CLASS VARIABLE

    public static void main(String[] args){
        // Variable Scope = where a variable can be access
        //                  local & class

        // local scope = variable declare inside a method
        // java uses Local scope first

        int x = 1; // LOCAL VARIABLE IN MAIN
        System.out.println(x);
    }

    static void doSomething(){
        int x = 2; // LOCAL VARIABLE IN doSomething
        System.out.println(x);
    }
}
