import java.util.Scanner;
public class tennis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num_balls;
        double totalCost;

        System.out.println("Input the number of balls: ");

        num_balls = input.nextInt();
        if (num_balls < 10) {
            totalCost = 2.0 * num_balls;
        } else {
            totalCost = 1.5 * num_balls;
        }
        System.out.println("Total cost is $" + totalCost);






    }
}