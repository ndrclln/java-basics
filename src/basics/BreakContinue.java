package basics;

public class BreakContinue {
    public static void main(String[] args){
        // break    = break out of a loop (STOP)
        // continue = skip current iteration of a loop (SKIP)

        System.out.println("USING BREAK:");
        for(int i = 0; i < 10; i++){
            if(i == 5){
                break;
            }
            System.out.print(i + " ");

            // OUTPUT: 1 2 3 4
        }

        System.out.println();
        System.out.println("USING CONTINUE:");
        for(int i = 0; i < 10; i++){
            if(i == 5){
                continue;
            }
            System.out.print(i + " ");

            // OUTPUT: 1 2 3 4 6 7 8 9
        }

    }
}
