package part10;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=6651s
//        starts at 1:50:51 — stop at about 1:57:41, at "so that is the basics of 2D arrays"
// Guide: GUIDE.md in this folder, steps 7–11
//
// Part 10 — 2D arrays (an array of arrays: rows and columns)
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called TwoDArrays.
//    Leave the "package part10;" line and the class line alone. Type everything else.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class TwoDArrays {
    public static void main(String[] args) {
        // Create a 2D array with 3 rows of cars
        String[][] cars = {
                // Store three cars in the first row.
                {"Camaro", "Corvette", "Silverado"},
                // Store three cars in the second row.
                {"Mustang", "Ranger", "F-150"},
                // Store three cars in the third row.
                {"Ferrari", "Lambo", "Tesla"}
        };
        // Start a loop to go through each row.
        for (int i = 0; i < cars.length; i++) {
            // Move to a new line for each row.
            System.out.println();
            // Start a loop to go through each car in the row.
            for (int j = 0; j < cars[i].length; j++) {
                // Print each car with a space after it.
                System.out.print(cars[i][j] + " ");
            }
        }
    }
}
