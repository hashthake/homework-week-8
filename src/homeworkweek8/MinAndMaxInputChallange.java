package homeworkweek8;

import java.util.Scanner;

public class MinAndMaxInputChallange {

    public static void n1() {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter Number : ");
            int value = scan.nextInt();
            if (value == -1) {
                break;
            }
            if (value < min) {
                min = value;
            }
            if (value > max) {
                max = value;
            }
        }
        System.out.println("Minimum number : " + min);
        System.out.println("Maximum number : " + max);


    }

    public static void main(String[] args) {
        n1();
    }
}
