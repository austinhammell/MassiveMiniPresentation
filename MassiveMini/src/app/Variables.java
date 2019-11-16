package app;

//Custom Class, will talk more about this later
public class Variables {
    //Custom Method, will talk more about this later
    public static void ShowVariables(){
        //Primitive Data Types:
        // A Primitive Data Type can be directly translated to binary (0s and 1s), and do not require the "new" keyword (we will cover this later)
        // These are often the same from language to language.

        // boolean is used for true/false
        // A boolean represents a single bit (represented as 0 or 1)
        // boolean True = true;
        // boolean False = false;
        // System.out.println(True + " " + False);

        // Byte stores values from -128 to 127
        // 1 Byte = 8 bits
        // byte lowestByte = -128;
        // byte highestByte = 127;
        // byte tooMuchForByte = 128;
        // System.out.println(lowestByte + " to " + highestByte);

        // 1 short = 2 bytes
        // short lowestShort = -32768;
        // short highestShort = 32767;
        // System.out.println(lowestShort + " to " + highestShort);

        // 1 int = 4 bytes
        // int lowestint = -2147483648;
        // int highestint = 2147483647;
        // System.out.println(lowestint + " to " + highestint);

        // Floating Point Numbers:
        // Floating point numbers are used to store decimals, and come in a few variaties.

        // float uses less memory but is less precise
        // float myFloat = 3.14159265
        // System.out.println(myFloat);

        // double uses more memory but is more precise
        // double myDouble = 3.141592653589793d;
        // System.out.println(myDouble);

        // Powers
        // float fPower = 12E4f;
        // double dPower = 12E4d;
        // System.out.println(fPower);
        // System.out.println(dPower);

        // //char stores one character
        // char Char = 'f';
        // System.out.println(Char);

        // Although a string is used very often in Java, it is technically not a primitive type, although you can use them without the "new" keyword,
        // Meaning it is actually an object that has methods associated with it.
        // String greeting = "Hello World";
        // System.out.println(greeting);
        // System.out.println(greeting.length());
    }
}
