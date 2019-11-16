package app;

public class Arrays{
    public static void ShowArrays(){
        // Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
        // Once an array is declared, you cannot change it's length, and must instead create a new array and copy into it.

        // There are several ways to create arrays:
        int[] numbers = new int[]{1, 2, 3, 4, 5};
        int[] moreNumbers = new int[5];
        // These will both have the same length, but moreNumbers will not have any contents.

        // To call to a certain number within the array above we have to declare the index of the number we want to display.
        // It is important to note that in most major programming languages, counting starts at 0 (referred to as "0-indexing")
        // With that in mind, what will this statement print?
        System.out.println(numbers[1]);
        // System.out.println(numbers[0]);

        // How do you display all items of an array?
        // System.out.println(numbers);
        // Arrays are just Objects so when we try and print out an object java just shows us the internal representation of the object.
        // To show all numbers in the array above we will have to loop through the array which we will show a little bit later.

        // Updating the value of an array
        // numbers[1] = 3;
        // System.out.println(numbers[1]);

        // Declaring Multidimensional array
        // int[][] Multidimensional = new int[][]{ {1, 2, 3}, {4, 5, 6} };
        // System.out.println(Multidimensional[1][2]);
    }
}
