import java.util.*;

public class TempConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int fahrenheit = input.nextInt();

        int celsius = ((fahrenheit - 32) * 5) / 9;

        System.out.println(celsius);

    }
}