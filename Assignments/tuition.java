import java.util.Scanner;
public class Tuition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double unit_enrolled, unit_fee, total_fee;

        System.out.println("Enter number of unit enrolled: ");
        unit_enrolled = input.nextInt();

        unit_fee = 45;
        total_fee = (((unit_enrolled * unit_fee) * 1.15 ) + 200);
        System.out.println(total_fee);


    
    }
}