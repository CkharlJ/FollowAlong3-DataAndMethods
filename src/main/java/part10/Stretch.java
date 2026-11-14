package part10;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=6233s
//        rewatch 1:43:53 (arrays), 1:48:37 (looping through an array), 1:53:36 (2D loops)
// Guide: GUIDE.md in this folder
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.

public class Stretch {
    public static void main(String[] args) {
        int [] nums = {4, 8, 1, 16};
        /* MY GUESS
        it will  be printed out 8
         */
        System.out.println(nums[1]);
        /* MY GUESS
         it will be printed , I'd say 3
        // I misunderstood the length , and I count the list as index.
         */
        System.out.println(nums.length);
        /* MY GUESS
        It will be printed out 17
         */
        nums[0] = nums[3] + 1;
        /* MY GUESS
        It will be printed out 4
         */
        System.out.println(nums[0]);
        for (int i = nums.length - 1; i >= 0; i--) {
            /* MY GUESS
            It will be printed out 16,1,8,4
            // I didn't understand , I didnt knew you had to keep the preious answer as the values
             */
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        int[][] grid = {{1, 2, 3}, {4, 5, 6}};
        /* MY GUESS
        it will be printed out 2 4
        // I was wrong , I was stuck on the "grid"
         */
        System.out.println(grid[1] [0]);
        /* MY GUESS
        that will print 2 rows and 3 columns
         */
        System.out.println(grid.length + " rows, " + grid[0].length + " columns");

        String[] foods = {"Pizza", "Tacos", "Wings"};
        for (int i = 0; i < foods.length; i++) {
            System.out.println("I like " + foods[i]);
        }


        int[] scores = {88, 92, 75, 100, 64};
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        double average = (double) sum / scores.length;
        System.out.println("Total: " + sum);
        System.out.println("Average: " + average);

        String[][] seats = {
                {"Anna", "Ben", "Cal"},
                {"Dee", "Eli", "Fay"}
        };
        for (int row = 0; row < seats.length; row++) {
            System.out.print("Row " + (row + 1) + ":\t");
        }
        System.out.println();
    }
}
