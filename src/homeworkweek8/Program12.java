package homeworkweek8;

import java.util.Scanner;
/* This program to find out that entered number is prime number or not*/
public class Program12 {

    public void primeNumber() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number to find it is prime or not : ");
        int num = scan.nextInt();

        boolean prime = false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                prime = true;
                break;
            }
        }
        if (!prime)
            System.out.println(num + " is a prime number");
        else
            System.out.println(num + " is not a prime number");

    }

    public static void main(String[] args) {
        Program12 obj = new Program12();
        obj.primeNumber();
    }

}
