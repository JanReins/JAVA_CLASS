import java.util.*;

public class Mario {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);

        int size = input.nextInt();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}