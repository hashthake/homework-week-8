package homeworkweek8;

import java.util.Scanner;
/* This program is to find out that number entered by user is palindrome number or not*/
public class PalinDromeNumber {
    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scan.nextInt();
        System.out.printf("Is the number %d a palindrome number?\n", n);
        System.out.println(is_Palindrome(n));
    }

    public static int reverse_nums(int n) {
        int reverse = 0;
        while (n != 0) {
            reverse *= 10;
            reverse += n % 10;
            n /= 10;
        }
        return reverse;
    }

    public static boolean is_Palindrome(int n) {
        return (n == reverse_nums(n));
    }


}





