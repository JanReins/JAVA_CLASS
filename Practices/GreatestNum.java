import java.util.*;

public class GreatestNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input the 1st number: ");
        int num1 = input.nextInt();

        System.out.print("Input the 2nd number: ");
        int num2 = input.nextInt();

        System.out.print("Input the 3rd number: ");
        int num3 = input.nextInt();

        int greatestNumber = num1;
        if (num2 > greatestNumber) {
            greatestNumber = num2;
        }
        if (num3 > greatestNumber) {
            greatestNumber = num3;
        }

        System.out.println("The greatest number is: " + greatestNumber);
    }
}
