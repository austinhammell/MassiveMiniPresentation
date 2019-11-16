package app;

public class Conditionals{
    public static void ShowConditionals(){
        //Conditional statements allow you to execute different parts of code depending on a condition.

        String[] animals = new String[]{"Bear", "Giraffe", "Panda"};
        for (String animal : animals){
            if (animal == "Bear"){
                System.out.println("A " + animal + " is very scary");
            } else {
                System.out.println("A " + animal + " is not scary at all");
            }
        }

        // for (int i = 0; i <= 20; i++){
        //     if (i == 5){
        //         System.out.print("Five");
        //     } else if (i == 10) {
        //         System.out.print("Ten");
        //     } else {
        //         System.out.print(i);
        //     }
        // }

        // for (String animal : animals){
        //     switch (animal){
        //         case "Bear":
        //             System.out.println("\nScary");
        //             break;
        //         default:
        //             System.out.println("Not Scary");
        //             break;
        //     }
        // }
    }
}