import java.util.Scanner;
public class tuition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double unit_enrolled, unit_fee, blanket_fee, total_fee, miscellaneous_fee;

        System.out.println("Enter number of unit enrolled: ");
        unit_enrolled = input.nextInt();

        unit_fee = 45;
        miscellaneous_fee = 1.15;
        blanket_fee = 200;

        total_fee = (((unit_enrolled * unit_fee) * miscellaneous_fee) + blanket_fee);
        System.out.println(total_fee);


    
    }
}