package homeworkweek8;

import java.util.Scanner;

/** Read 10 numbers entered by user and retutn sum of those numbers
 * Use hasNextInt() to check user entered valid numbers
 * if hasNextInt() return false, print the message"Invalid number", continue untill read 10 numbers
 * Before enter each number ask to enter number
 */
public class ReadingUserInputChallange {

    public void challange() {

        Scanner scanner = new Scanner(System.in);

        int count = 1;
        int sum = 0;

        while (count <= 10) {
            System.out.println("Enter number #x" + count);
            boolean validatenumber = scanner.hasNextInt();
            if (validatenumber) {
                int number = scanner.nextInt();
                sum += number;
                count++;
            } else {
                System.out.println("Invalid number");
            }
            scanner.nextLine();
            System.out.println("Sum of all number = " + sum);
        }
    }

    public static void main(String[] args) {
        ReadingUserInputChallange obj = new ReadingUserInputChallange();
        obj.challange();
        //scanner.close();

    }

}
