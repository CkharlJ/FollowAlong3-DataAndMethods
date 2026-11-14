package part11;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=7151s
//        rewatch 1:59:10–2:03:35 for the String methods, 2:07:30–2:11:35 for wrapper classes
// Guide: GUIDE.md in this folder, steps 2–15
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.

public class Stretch {
    public static void main(String[] args) {
        String word = "Java";
        /* MY GUESS
        It will be printed 4
         */
        System.out.println(word.length());
        /* MY GUESS
        It will be printed out a
         */
        System.out.println(word.charAt(1));
        /* MY GUESS
        It will be printed out 2
         */
        System.out.println(word.indexOf("v"));
        /* MY GUESS
        It will be printed out JAVA
         */
        System.out.println(word.toUpperCase());
        /* MY GUESS
        It will be printed out Jovo
         */
        System.out.println(word.replace('a', 'o'));
        /* MY GUESS
        It will be printed out false
         */
        System.out.println(word.equals("java"));
        /* MY GUESS
        true
         */
        System.out.println(word.equalsIgnoreCase("java"));
        /* MY GUESS
        It will be printed out Java
         */
        System.out.println(word);

        String city = "  Dover  ";
        String clean = city.trim();
        System.out.println(clean.toUpperCase());
        System.out.println(clean.length());
        System.out.println(clean.charAt(0));

        Integer apples = 5;
        Integer oranges = 10;

        int fruit = apples + oranges;

        Double price = 9.99;
        Boolean isOpen = true;

        System.out.println("Fruits: " + fruit);
        System.out.println("Two cost: " + (price * 2));
        if (isOpen) {
            System.out.println("The store is open");
        }
        String first = "Jordan";
        String last = "Smith";

        String username = first.toLowerCase().charAt(0) + last.toLowerCase();
        System.out.println(username);
        System.out.println(username + "@desu.edu");
    }
}
