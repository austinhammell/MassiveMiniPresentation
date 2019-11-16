package app;
import java.util.Scanner;
public class Loops{
    public static void ShowLoops(){
        //Loops allow for the execution of code until a certain condition is met.

        // while loop will execute the code until the condition specified is met, but we cannot easily compute when it will be met.
        // These are very useful when collecting user input.
        System.out.println("\nWhile Loop!");
        // The Scanner is a commonly used tool for gathering user input.
        Scanner input_getter = new Scanner(System.in);
        String user_input = "";
        while (!user_input.equals("Hello!")){
          System.out.println("Please enter Hello! to continue:");
          user_input = input_getter.nextLine();
        }
        input_getter.close();


        // For loops are used when you know, or can calculate easily, when you will stop the loop
        // They are made up of 3 statements:
        // 1. Precondition: What do we need to assert to start the loop?
        // 2. Postcondition: When will we stop the loop?
        // 3. Iteration: What should we do each time we loop

        // In this loop, our precondition asserts that we will use a new integer "i"
        // (i is a standard for looping variables)
        // Our postcondition asserts that we will stop when i = 10
        // If our postcondition is not met, we will add 1 to i
        for (int i = 0; i < 10; i++){
            System.out.println(i);
        }


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
