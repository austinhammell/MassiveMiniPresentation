package app;

public class Arrays{
    public static void ShowArrays(){
        //Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.

        int[] numbers = new int[]{1, 2, 3, 4, 5};
        //To call to a certain number within the array above we have to declare the index of the number we want to display.
        System.out.println(numbers[1]); //Arrays are 0 based meaning the index of the 1st item will be 0.
        //Thats why you see 2 from this statement.
        // System.out.println(numbers[0]);

        // //How do you display all items of an array?
        // System.out.println(numbers);
        // //Arrays are just Objects so when we try and print out an object java just shows us the hash code for the object.
        // //To show all numbers in the array above we will have to loop through the array which we will show a little bit later.

        // //Updating the value of an array
        // numbers[1] = 3;
        // System.out.println(numbers[1]);

        // //Declaring Multidimensional array
        // int[][] Multidimensional = new int[][]{ {1, 2, 3}, {4, 5, 6} };
        // System.out.println(Multidimensional[1][2]);
    }
}