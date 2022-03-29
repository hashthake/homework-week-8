package homeworkweek8;
/**This is a method to calculate sum of entered digits
* using sumDigit method*/
import java.util.Scanner;

public class DigitSumChallange {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Input valid number");
        int number = scan.nextInt();
        System.out.println("The sum is " + sumDigits(number));

    }

    public static int sumDigits(long n) {
        int result = 0;
        if (n < 10) return -1;
        while (n > 0) {
            result += n % 10;
            n /= 10;
        }

        return result;
    }
}
