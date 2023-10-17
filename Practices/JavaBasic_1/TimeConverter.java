import java.util.*;

public class TimeConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        long number = input.nextLong();

        long seconds = number % 60;
        long minutes1 = number / 60;
        long minutes = minutes1 % 60;
        long hours = ((number / 60) / 60);
        

        System.out.println(hours);
        System.out.println(minutes);
        System.out.println(seconds);
    }

}