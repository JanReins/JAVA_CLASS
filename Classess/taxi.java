import java.util.Scanner;
public class taxi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double fee;
        int distance;

        System.out.println("Enter the distance traveled: ");

        distance = input.nextInt();

        if (distance <= 300) {
            fee = 1.5 * distance;
        } else {
                fee = 1.5 * 300 + (distance - 300) * 3;
            }
            System.out.println("Total fare is: $" + fee);
        }
    }