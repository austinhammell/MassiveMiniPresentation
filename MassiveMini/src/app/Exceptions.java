package app;

public class Exceptions {
    public static void ShowExceptions() throws NullPointerException {
        //Exceptions can occur when something unexpected happens during the code execution.

        try {
            //Try tries a certain part of code.
            throw new NullPointerException();
        } 
        catch (NullPointerException npe){
            //Catch will catch the exception specified.
            System.out.println("Exception caught!");
        } 
    }
}