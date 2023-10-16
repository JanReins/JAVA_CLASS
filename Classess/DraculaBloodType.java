import java.util.*;

public class DraculaBloodType {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name;
        char bloodType;
        double volume, pay;

        do {
            System.out.print("Enter name: ");
            name = input.next();

            System.out.print("Enter blood type (A/B/C/O): ");
            bloodType = input.next().charAt(0);

            System.out.print("Enter volume: ");
            volume = input.nextDouble();

            pay = 0;

            switch (bloodType) {
                case 'A': case 'a':
                    pay = volume * 3000.00;
                    break;
                case 'B': case 'b':
                    pay = volume * 1800.75;
                    break;
                case 'C': case 'c':
                    pay = volume * 2880.25;
                    break;
                case 'O': case 'o':
                    pay = volume * 1500.00;
                    break;
                default:
                    System.out.println("Invalid Blood Type");
            }

            System.out.println(name + " will receive " + pay);
        } while (bloodType == 'A' || bloodType == 'a' || bloodType == 'B' || bloodType == 'b' || bloodType == 'C' || bloodType == 'c' || bloodType == 'O' || bloodType == 'o');
    }
}
