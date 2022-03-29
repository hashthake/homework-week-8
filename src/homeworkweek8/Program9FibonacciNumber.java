package homeworkweek8;

import java.util.Scanner;

/* This is class to find out Fibonacci number */
public class Program9FibonacciNumber {

    public void Fibonacci() {
        int n = 0, a = 1, b = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number");
        int n1 = scan.nextInt();
        System.out.println("1 1");
        while (n < n1) {
            n = a + b;
            System.out.println(n + " ");
            a = b;
            b = n;
        }
    }

    public static void main(String[] args) {
        Program9FibonacciNumber obj = new Program9FibonacciNumber();
        obj.Fibonacci();
    }
}
