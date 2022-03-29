package homeworkweek8;

import java.util.Scanner;

/** this program is to find out that entered number
 * is armstrong number or not
 */
public class Program10ArmstrongNumber {

    public static void Armstrong(){

int n, arm=0, nonarm, a;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number ");
        n=scan.nextInt();
        a=n;

        while (n>0){
            nonarm = n%10;
            arm = (nonarm*nonarm*nonarm) + arm;
            n = n/10;
        }
if (a==arm)
    System.out.println("Armstrong number");
else
    System.out.println("Not a Armstrong number");
    }

    public static void main(String[] args) {
        Armstrong();
    }
}
