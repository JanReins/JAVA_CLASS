import java.util.*;

public class Speed {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int distance = input.nextInt();

        int hours, minutes, seconds;

        hours = input.nextInt();
        minutes = input.nextInt();
        seconds = input.nextInt();

    double timeInSeconds = (hours * 60 * 60) + (minutes * 60) + seconds;
    double metersInSecond = distance / timeInSeconds;

    double timeInHours = timeInSeconds / 3600;
    double kmPerHour = (distance / 1000.0 ) / timeInHours;
    double mph = kmPerHour / 1.609;

    System.out.println(metersInSecond);
    System.out.println(kmPerHour);
    System.out.println(mph);
        
    }
}