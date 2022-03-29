package homeworkweek8;
/* This program to calculate sum of even numbers*/
public class EvenDigitSum {

public static int getEvenDigitSum(int number){

    int total =0;

    if(number>0){
        while(number !=0){
            int even = number % 10;
            if(even % 2 ==0){
                total+= even;
            }
            number/=10;
        }
        System.out.println(total);
    }
    return -1;


}

    public static void main(String[] args) {
        getEvenDigitSum(56656);
    }
}
