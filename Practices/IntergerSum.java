import java.util.*;

public class DaysConverter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int minutes = input.nextInt();

        int years, days;

        years = minutes / (60 * 24 * 365);
        days = minutes % (60 * 24 * 365);

        System.out.println(years + " years " + days + " days");

    }
}