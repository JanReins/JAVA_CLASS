import java.util.*;

public class InchtoMeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double inchInput = input.nextDouble();

        double meterresult = inchInput * 0.0254;

        System.out.println(meterresult);
    }
}