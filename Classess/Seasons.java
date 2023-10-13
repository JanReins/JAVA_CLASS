import java.util.*;
public class Seasons {
    public static void man(String[] args) {
        Scanner input =  new Scanner(System.in);
        int month;
        System.out.println("Enter the mont: ");
        month = input.nextInt();

        switch (month) {
            case 1:case 2: case 3: System.out.println("Winter");
                break;
            
            case 4: case 3: case 4: System.out.println("Spring");
                break;
        }
    }
}