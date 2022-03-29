package homeworkweek8;

import java.util.Scanner;

/**
 * This is Display patteren for no of rows entered by user
 */

public class Program6DisplayPattern {

    public static void pattern() {

        int i, j, n;

        Scanner num = new Scanner(System.in);
        System.out.println("Input number of rows : ");
        n = num.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        pattern();
    }
}
