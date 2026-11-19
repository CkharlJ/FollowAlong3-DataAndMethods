package part13;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=8874s
//        starts at about 2:27:54 — stop at about 2:39:30, when he says "those are methods"
// Guide: GUIDE.md in this folder, steps 1–11
//
// Part 13 — methods
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called Methods.
//    Leave the "package part13;" line and the "public class Methods" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class Methods {
    public static void main(String[] args) {
        // Create a String variable called name and set it to Bro.
        String name = "Bro";
        // Create an integer variable called age and set it to 21.
        int age = 21;
        // Call the hello method and pass the name and age.
        hello(name, age);
        // Create an integer variable x and set it to 3.
        int x = 3;
        // Create an integer variable y and set it to 4.
        int y = 4;
        // Call the add method and store the result in z.
        int z = add(x, y);
        // Print the value stored in z.
        System.out.println(z);
        // Call the add method again and print the result.
        System.out.println(add(x, y));
    }
    // Create a method that takes a name and age.
    static void hello(String name, int age) {
        // Print a greeting with the name.
        System.out.println("Hello " + name);
        // Print the person's age.
        System.out.println("You are " + age);
    }
    // Create a method that adds two integers and returns the result.
    static int add(int x, int y) {
        // Add x and y and return the answer.
        return x + y;
    }
}
