import java.util.Scanner;

public class Appliance {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int applianceType;
            double commission, salesAmount;

            applianceType = input.nextInt();
            salesAmount = input.nextInt();


            if (applianceType == 1) {
                if (salesAmount * 0.07 < 400) {
                    commission = 400;
                } else {
                    commission = salesAmount * 0.07;
                }

            } else if (applianceType == 2) {
                if (salesAmount * 0.10 < 900) {
                    commission = salesAmount * 0.10;
                } else commission = 900;

            } else if (applianceType == 3) {
                commission = salesAmount * 0.12;
            } else commission = 250;

            System.out.println(commission);
    }
}