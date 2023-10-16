import java.util.*;

public class NegativePositive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        if (number <=0 ) {
            System.out.println("Number is negative");
        }

        else {
            System.out.println("Number is positive");
        }
    }
}