package homeworkweek8;

import java.util.Scanner;

/** This is a program contains dimond of star
 * by entering number of rows by user
 */
public class Program14DimondForLoop {

    public void dimond() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Input number of rows (half of the dimond)");
        int rows = scan.nextInt();
        int i = 1;
        int n;
        while (i <= rows) {
            n = 1;
            while (n++ <= rows - i) {
                System.out.print(" ");
            }
            n = 1;
            while (n++ <= i * 2 - 1) {
                System.out.print("*");
            }
            System.out.println();
            i++;
        }
        i = rows - 1;
        while (i > 0) {
            n = 1;
            while (n++ <= rows - i) {
                System.out.print(" ");
            }
            n = 1;
            while (n++ <= i * 2 - 1) {
                System.out.print("*");
            }
            System.out.println();
            i--;
        }
    }

    public static void main(String[] args) {
        Program14DimondForLoop obj = new Program14DimondForLoop();
        obj.dimond();

    }
}