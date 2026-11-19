package part14;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=9618s
//        starts at about 2:40:18 — stop at about 2:45:29, when he says
//        "if you would like a copy of all this code"
// Guide: GUIDE.md in this folder, Video 1 — the same lesson, written out step by step
//
// Part 14, video 1 — overloaded methods
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called OverloadedMethods.
//    Leave the "package part14;" line and the "public class OverloadedMethods" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class OverloadedMethods {
    public static void main(String[] args) {
        // Create a boolean variable and set it to true.
        boolean myBoolean = true;
        // Create a char variable and set it to @.
        char myChar = '@';
        // Create a String variable and set it to Bro.
        String myString = "Bro";
        // Create an integer variable and set it to 50.
        int myInt = 50;
        // Create a double variable and set it to 1000.
        double myDouble = 1000;
        // Print the boolean value.
        System.out.printf("%b\n", myBoolean);
        // Print the character value.
        System.out.printf("%c\n", myChar);
        // Print the String value.
        System.out.printf("%s\n", myString);
        // Print the integer value.
        System.out.printf("%d\n", myInt);
        // Print the double with 6 decimal places.
        System.out.printf("%f\n", myDouble);
        // Print the String right-aligned in 10 spaces.
        System.out.printf("Hello %10s\n", myString);
        // Print the String left-aligned in 10 spaces.
        System.out.printf("Hello %-10s!\n", myString);
        // Print the money with 6 decimal places.
        System.out.printf("You have this much money %f\n", myDouble);
        // Print the money with 2 decimal places.
        System.out.printf("You have this much money %.2f\n", myDouble);
        // Print the money with 1 decimal place.
        System.out.printf("You have this much money %.1f\n", myDouble);
        // Print the money left-aligned in 20 spaces.
        System.out.printf("You have this much money %-20f!\n", myDouble);
        // Print the money right-aligned in 20 spaces.
        System.out.printf("You have this much money %20f!\n", myDouble);
        // Print the positive number with a plus sign.
        System.out.printf("You have this much money %+f\n", myDouble);
        // Print the negative number with a minus sign.
        System.out.printf("You have this much money %+f\n", -myDouble);
        // Print the number with leading zeros in 20 spaces.
        System.out.printf("You have this much money %020f\n", myDouble);
        // Print the number with a comma separator.
        System.out.printf("You have this much money %,f\n", myDouble);
    }
}
