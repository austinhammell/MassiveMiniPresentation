package app;

public class Loops{
    public static void ShowLoops(){
        //Loops allow for the execution of code until a certain condition is met.

        //for loop: declare variable -> check condition -> execute code -> code for after execution
        for (int i = 0; i < 10; i++){
            System.out.print(i);
        }

        //while loop will execute the code until the condition specified is met
        // System.out.println("\nWhile Loop!");

        // int ii = 0;
        // while (ii < 10){
        //     System.out.print(ii);
        //     ii++;
        // }

        // //for each loop will loop through every item in a collection
        // System.out.println("\nFor Each Loop!");

        // int[] numbers = new int[]{1,2,3,4,5};
        // for (int i : numbers){
        //     System.out.print(i);
        // }

        // //We can write the same statement above with a for loop
        // System.out.print("\n");
        // for (int iii = 0; iii < numbers.length; iii++){
        //     System.out.print(numbers[iii]);
        //     //System.out.print(iii);
        // }

        //Infinite loops
        // boolean condition = true;
        // while (condition){
        //     System.out.print("Hello");
        // }
    }
}