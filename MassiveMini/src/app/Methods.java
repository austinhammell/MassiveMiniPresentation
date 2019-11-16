package app;

public class Methods {
    public void ShowMethods(){
        //Custom Methods are a way of defining a block of code that will only run when called upon.

        //Method declaration
        // Access Modifier
        //      Public - Method can be accessed from anywhere. Can be accessed from outside of the class it is defined in.
        //      Private - Method cannot be accessed from outside of the class it is defined in.
        //      Protected - Methods are accessible within same package or sub classes in different package.
        // Return Type
        //      The Type that will be returned from the method.
        //      void means nothing will be returned from the method.
        // Method Name
        //      This can be anything.
        // Parameter list 
        //      A list of variables to be passed into your method. (Comma delimited)
        // Exception list
        //      We will talk about this part later.
        // Body of Method
        //      The code you want your method to execute.

        int AddedNumbers = Add(1, 2);
        System.out.println(AddedNumbers);
        
        //AddVoid(1, 2);

    }

    public int Add(int x, int y){
        return x + y;
    }

    public void AddVoid(int x, int y){
        System.out.println(x + y);
    }
}