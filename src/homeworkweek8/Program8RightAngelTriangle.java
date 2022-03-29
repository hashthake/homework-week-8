package homeworkweek8;
/**
 * This is program to print Shape in triangle by entering number of
 * rows between 1 to 9 by user
 */

import java.util.Scanner;

public class Program8RightAngelTriangle {
    //method calling to main method
    public static void main(String[] args) {

        triangle();
    }

    // Nested loop method
    public static void triangle() {
        Scanner rows = new Scanner(System.in);
        System.out.println("Enter number of rows between 1 to 10 : ");
        int rows1 = rows.nextInt();
        for (int i = 1; i <= rows1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }
}