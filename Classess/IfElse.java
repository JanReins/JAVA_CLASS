/*program that accepts a number and determines wether it is even. If even, display "Even" */
import java.util.Scanner;
public class IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double purchase, bill;
        final double discount = 0.10;
        System.out.println("Enter your purchse: ");
        purchase = scanner.nextDouble();

        if (purchase >= 1000){
            bill = purchase-(purchase*discount);
        }

        else {
            bill = purchase;
        }
        System.out.println("Your bill is: " + bill);

    }
}