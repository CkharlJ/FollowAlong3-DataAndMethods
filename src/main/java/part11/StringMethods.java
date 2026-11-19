package part11;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=7095s
//        starts at about 1:58:15 — stop at about 2:03:35, when he says "those are a few of the more useful String methods"
// Guide: GUIDE.md in this folder, steps 1–10
//
// Part 11 — String methods
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called StringMethods.
//    Leave the "package part11;" line and the "public class StringMethods" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class StringMethods {
    public static void main(String[] args) {
        // Create a String variable called name and set it to Bro.
        String name = "Bro";
        // Check if name is exactly equal to Bro.
        boolean equalsResult = name.equals("Bro");
        // Print the result of the comparison.
        System.out.println(equalsResult);
        // Check if name equals bro with lowercase letters.
        boolean lowerResult = name.equals("bro");
        // Print the result of the lowercase comparison.
        System.out.println(lowerResult);
        // Compare name with bro without checking uppercase or lowercase.
        boolean ignoreResult = name.equalsIgnoreCase("bro");
        // Print the result of the comparison.
        System.out.println(ignoreResult);
        // Count how many characters are in name.
        int lengthResult = name.length();
        // Print the number of characters.
        System.out.println(lengthResult);
        // Get the first character of name.
        char charResult = name.charAt(0);
        // Print the first character.
        System.out.println(charResult);
        // Find the position of the letter o in name.
        int indexResult = name.indexOf("o");
        // Print the position of the letter o.
        System.out.println(indexResult);
        // Check if name is an empty String.
        boolean emptyResult = name.isEmpty();
        // Print whether name is empty.
        System.out.println(emptyResult);
        // Change all letters in name to uppercase.
        String upperResult = name.toUpperCase();
        // Print the uppercase name.
        System.out.println(upperResult);
        // Change all letters in name to lowercase.
        String lowerCaseResult = name.toLowerCase();
        // Print the lowercase name.
        System.out.println(lowerCaseResult);
        // Create a String with spaces before and after Bro.
        String spaced = "   Bro   ";
        // Remove the spaces at the beginning and end.
        String trimResult = spaced.trim();
        // Print the original String with its spaces.
        System.out.println("[" + spaced + "]");
        // Print the String after removing the extra spaces.
        System.out.println("[" + trimResult + "]");
        // Replace the letter o with the letter a.
        String replaceResult = name.replace('o', 'a');
        // Print the String with the replaced letter.
        System.out.println(replaceResult);
    }
}
