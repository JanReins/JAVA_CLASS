import java.util.*;

public class quiz_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int factorial(int);

        if((factorial(number)%2) == 0) {
            System.out.println("Not Prime!");
        } else {
            System.out.println("Prime!");
        }
    }
}