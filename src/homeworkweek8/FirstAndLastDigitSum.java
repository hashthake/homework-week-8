package homeworkweek8;
/** This program is to find sum of first and last digit from number
 *  if number in one digit return value as -1
 */
public class FirstAndLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {

        int lastDigit = 0;
        if (number >= 0) {
            lastDigit = number % 10;

            while (number > 9) {
                number = number / 10;
            }

            System.out.println("First number " + number + " Last number " + lastDigit + " Total = " + (number + lastDigit));
            return 0;
        }else
            System.out.println("-1");
        return -1;

    }

    public static void main(String[] args) {
        sumFirstAndLastDigit(436);
    }
}
