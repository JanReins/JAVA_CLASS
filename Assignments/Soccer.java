import java.util.*;

public class Soccer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int team1Goals = 0;
        int team2Goals = 0;

        int goal;
        do {
            goal = input.nextInt();
            if (goal == 1) {
                team1Goals++;
            } else if (goal == 2) {
                team2Goals++;
            } else if (goal != 0) {
                System.out.println("Invalid input. Please enter 1, 2, or 0.");
            }
        } while (goal != 0);

        System.out.println("Team 1 made " + team1Goals + " goal/s.");
        System.out.println("Team 2 made " + team2Goals + " goal/s.");

        if (team1Goals > team2Goals) {
            System.out.println("Team 1 won!");
        } else if (team1Goals < team2Goals) {
            System.out.println("Team 2 won!");
        } else {
            System.out.println("Both teams tied!");
        }
    }
}
