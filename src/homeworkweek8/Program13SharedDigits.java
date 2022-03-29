package homeworkweek8;

import java.util.Scanner;

/** This program is to find out that any number entered by user
 * has any shared digit or not
 */
public class Program13SharedDigits {

    public static boolean hasSharedDigit(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter first number : ");
        int a = scan.nextInt();
        System.out.println("Please enter second number : ");
        int b = scan.nextInt();

        if((a >=10 && a<=99)&&(b>=10&&b<=99)){
            int aLastDigit = a%10;
            int bLastDigit = b%10;
            a /=10;
            b /=10;
            int aFirstDigit = a;
            int bFirstDigit = b;
            System.out.println("Is there any shared digit in both given number? ");
            return ((aFirstDigit==bFirstDigit)||(aFirstDigit==bLastDigit)||(aLastDigit==bFirstDigit)
                    ||(aLastDigit==bLastDigit));

        }

        System.out.println("Invalid Input. ");
        return false;

    }


    public static void main(String[] args) {
        hasSharedDigit();
    }
}
