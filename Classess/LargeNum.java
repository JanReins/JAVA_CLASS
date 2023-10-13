import java.util.Scanner;

public class LargeNum {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println( "Enter a number: ");

            int number1, number2, number3;

            number1 = input.nextInt();
            number2 = input.nextInt();
            number3 = input.nextInt();
            
            if (number1 > number2 && number1 > number3) {
                System.out.println(number1); }
            else if (number2 > number1 && number2 > number3) {
                System.out.println(number2);
            } else {
                System.out.println(number3);
            }


    }
}