package app;

//Custom Class, will talk more about this later
public class Variables {
    //Custom Method, will talk more about this later
    public static void ShowVariables(){
        //Primitive Data Types:
        //A primitive data type specifies the size and type of variable values, and it has no additional methods.

        //Byte stores values from -128 to 127
        byte lowestByte = -128;
        byte highestByte = 127;
        //byte tooMuchForByte = 128;
        System.out.println(lowestByte + " to " + highestByte);
        
        // short lowestShort = -32768;
        // short highestShort = 32767;
        // System.out.println(lowestShort + " to " + highestShort);

        // int lowestint = -2147483648;
        // int highestint = 2147483647;
        // System.out.println(lowestint + " to " + highestint);

        // //double stores decimals
        // double Double = 3.141592653589793d;
        // System.out.println(Double);

        // //Powers
        // double power = 12E4d;
        // System.out.println(power);

        // //boolean is used for true/false
        // boolean True = true;
        // boolean False = false;
        // System.out.println(True + " " + False);

        // //char stores one character
        // char Char = 'f';
        // System.out.println(Char);

        // //Although a string is used very often in Java, it is actually a Non-Primitive type. 
        // //Meaning it is actually an object that has methods associated with it.
        // String greeting = "Hello World";
        // System.out.println(greeting);
        // System.out.println(greeting.length());
    }
}