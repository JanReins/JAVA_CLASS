import java.util.Scanner;
public class tuition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double unit_enrolled, total_fee;

        unit_enrolled = input.nextDouble();
       total_fee = (((unit_enrolled * 45) * 1.15) + 200);
        System.out.println(total_fee);


    
    }
}