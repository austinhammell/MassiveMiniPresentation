package app;

public class Exceptions {
    public static void ShowExceptions(boolean throwException) throws Exception {
        // Exceptions can occur when something unexpected happens during the code execution.
        // They will stop program flow unless handled:
        if(throwException)
          throw new Exception();

        // A try catch block will "try" to execute a block of code and "catch" any exceptions to handle them.
        try {
            //Try tries a certain part of code.
            if(!throwException)
            // Exceptions can be thrown in any method that is within our try block
            // their exceptions will be handled.
              ThrowException();
            // int[] x = new int[1];
            // int y = x[2];
        }
        catch(ArrayIndexOutOfBoundsException aioobe){
          // You can have multiple catch statements for different types of exceptions
          System.out.println("Caught Array Index Exception!");
        } catch (Exception e){
            //Catch will catch the exception specified.
            System.out.println("Exception caught!");
        }
    }

    private static void ThrowException() throws Exception {
      throw new Exception();
    }
}
