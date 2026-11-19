package part12;
// Import ArrayList to create a list of items.
import java.util.ArrayList;
// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=7922s
//        starts at about 2:12:02 — stop at about 2:16:20, when he says "that is ArrayLists in Java"
// Guide: GUIDE.md in this folder, steps 1–6
//
// Part 12 — ArrayList
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called ArrayLists.
//    Leave the "package part12;" line and the "public class ArrayLists" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class ArrayLists {
    public static void main(String[] args) {
        // Create an ArrayList to store food names.
        ArrayList<String> food = new ArrayList<String>();
        // Add pizza to the list.
        food.add("pizza");
        // Add hamburger to the list.
        food.add("hamburger");
        // Add hotdog to the list.
        food.add("hotdog");
        // Loop through all the items in the list.
        for (int i = 0; i < food.size(); i++) {
            // Print the food at the current position.
            System.out.println(food.get(i));
        }
        // Replace the first food with sushi.
        food.set(0, "sushi");
        // Print the updated list.
        System.out.println(food);
        // Remove the third food from the list.
        food.remove(2);
        // Print the list after removing an item.
        System.out.println(food);
        // Remove all the items from the list.
        food.clear();
        // Print the empty list.
        System.out.println(food);
    }
}

