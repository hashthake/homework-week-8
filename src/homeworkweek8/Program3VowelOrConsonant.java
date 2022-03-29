package homeworkweek8;
/** This program is to find out that entered character by user is vowel or consonant*/
import java.util.Scanner;

public class Program3VowelOrConsonant {

    public void vowelorconsonant(){
        int i =0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch = scan.next().charAt(0);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            System.out.println("Entered "+ch+" is Vowel");
        }
        else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
            System.out.println("Entered " +ch+ " is Consonant");
        else
            System.out.println("Not a valid number");

    }

    public static void main(String[] args) {
        Program3VowelOrConsonant obj = new Program3VowelOrConsonant();
        obj.vowelorconsonant();
    }
}
