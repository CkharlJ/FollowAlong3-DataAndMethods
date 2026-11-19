package part12;
// Import ArrayList to create a list of items.
import java.util.ArrayList;
// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=8210s
//        starts at about 2:16:50 — stop at about 2:23:45, when he says "that's how two-dimensional ArrayLists work"
// Guide: GUIDE.md in this folder, steps 7–10
//
// Part 12 — 2D ArrayList
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called TwoDArrayLists.
//    Leave the "package part12;" line and the "public class TwoDArrayLists" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class TwoDArrayLists {
    public static void main(String[] args) {
        // Create an ArrayList to store bakery items.
        ArrayList<String> bakeryList = new ArrayList<String>();
        // Add pasta to the bakery list.
        bakeryList.add("pasta");
        // Add garlic bread to the bakery list.
        bakeryList.add("garlic bread");
        // Add donuts to the bakery list.
        bakeryList.add("donuts");
        // Create an ArrayList to store vegetables.
        ArrayList<String> produceList = new ArrayList<String>();
        // Add tomatoes to the produce list.
        produceList.add("tomatoes");
        // Add zucchini to the produce list.
        produceList.add("zucchini");
        // Add peppers to the produce list.
        produceList.add("peppers");
        // Create an ArrayList to store drinks.
        ArrayList<String> drinksList = new ArrayList<String>();
        // Add soda to the drinks list.
        drinksList.add("soda");
        // Add coffee to the drinks list.
        drinksList.add("coffee");
        // Print all the bakery items.
        System.out.println(bakeryList);
        // Print the first item in the bakery list.
        System.out.println(bakeryList.get(0));
        // Print all the drinks.
        System.out.println(drinksList);
        // Create a 2D ArrayList to store all three lists.
        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();
        // Add the bakery list to the grocery list.
        groceryList.add(bakeryList);
        // Add the produce list to the grocery list.
        groceryList.add(produceList);
        // Add the drinks list to the grocery list.
        groceryList.add(drinksList);
        // Print all the lists inside the grocery list.
        System.out.println(groceryList);
        // Print the first list inside the grocery list.
        System.out.println(groceryList.get(0));
        // Print the first item from the first list.
        System.out.println(groceryList.get(0).get(0));
        // Print the second item from the third list.
        System.out.println(groceryList.get(2).get(1));
    }
}
