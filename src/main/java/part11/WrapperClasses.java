package part11;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=7467s
//        starts at about 2:04:27 — stop at about 2:11:35, when he says "that's the basics of wrapper classes"
// Guide: GUIDE.md in this folder, steps 11–15
//
// Part 11 — wrapper classes
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called WrapperClasses.
//    Leave the "package part11;" line and the "public class WrapperClasses" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class WrapperClasses {
    public static void main(String[] args) {
        // Create a Boolean object and set it to true.
        Boolean a = true;
        // Create a Character object and set it to @.
        Character b = '@';
        // Create an Integer object and set it to 123.
        Integer c = 123;
        // Create a Double object and set it to 3.14.
        Double d = 3.14;
        // Create a String variable and set it to Bro.
        String e = "Bro";
        // Check if a is true.
        if (a == true) {
            // Print a message if a is true.
            System.out.println("This is true");
        }
        // Check if b is equal to @.
        if (b == '@') {
            // Print a message if b is @.
            System.out.println("This is true");
        }
    }
}
