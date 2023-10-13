import java.util.Scanner;
public class driverFines {
    public static void main(String[] args)
        Scanner input = new Scanner(System.in);

        double fines;
        int speed;
        
        speed = input.Scanner(System.in);

        if (speed <= 80) {
            fines = 0;
        } if else (speed == 100) {
            fines = 500;
        } else {
            fines = 800;
        }

        System.out.println(fines);
}

    