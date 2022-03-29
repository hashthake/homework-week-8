package homeworkweek8;

import java.util.Scanner;

/**
 * This is program about right angle star
 * by entering number between 1 to 10 by user
 */
public class Program15RightAngleStarTriangle {

    public static void triangle() {

        Scanner rows = new Scanner(System.in);
        System.out.println("Enter number of rows between 1 to 10");
        int n = rows.nextInt();
        int i, j;

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        triangle();

    }
}
