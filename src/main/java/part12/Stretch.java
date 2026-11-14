package part12;
import java.util.ArrayList;


// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=7922s
//        rewatch 2:12:00–2:16:20 for ArrayList, 2:16:50–2:23:45 for 2D ArrayList,
//        2:23:57–2:27:20 for the for-each loop
// Guide: GUIDE.md in this folder
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet, and no import. Typing both is part of the stretch.

public class Stretch {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        colors.set(1, "yellow");
        colors.remove(0);
        /* MY GUESS
        it will print red, green, blue
        // I did not read carefully , I thought color.set was doing something else
         */
        System.out.println(colors);
        /* MY GUESS
        it will print 3
         */
        // I understand why its 2 , by my first mistake at the beginning
        System.out.println(colors.size());
        /* MY GUESS
        It will print yellow
         */
        System.out.println(colors.get(0));
        for (String c : colors) {
            /* MY GUESS
            It will print red green blue yellow
             */
            // same mistake , as my first guess.
            System.out.print(c + " ");
        }
        System.out.println();

        ArrayList<Integer> scores = new ArrayList<Integer>();
        scores.add(90);
        scores.add(75);
        scores.add(88);
        int sum = 0;

        for (int s : scores) {
            sum = sum + s;
        }
        System.out.println("Total: " + sum);

        ArrayList<String> playlist = new ArrayList<String>();
        playlist.add("Song A");
        playlist.add("Song B");
        playlist.add("Song D");
        for (int i = 0; i < playlist.size(); i++) {
            System.out.println((i + i) + ". " + playlist.get(i));
        }

        playlist.remove(1);
        System.out.println("Songs left: " + playlist.size());
        System.out.println(playlist);

        ArrayList<String> row1 = new ArrayList<String>();
        row1.add("Anna");
        row1.add("Ben");
        ArrayList<String> row2 = new ArrayList<String>();
        row2.add("Cam");
        row2.add("Dee");
        row2.add("Eli");
        ArrayList<ArrayList<String>> seats =
                new ArrayList<ArrayList<String>>();

        seats.add(row1);
        seats.add(row2);

        for (ArrayList<String> row : seats) {
            System.out.print("Row:");

            for (String person : row) {
                System.out.print(" " + person);
            }
            System.out.println();
        }
        System.out.println("Back corner: " + seats.get(1).get(2));
    }
}

