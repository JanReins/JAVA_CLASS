import java.util.Scanner;

public class GPA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalGradePoints = 0;
        int totalUnits = 0;

        for (int i = 1; i <= 7; i++) {
            System.out.print("Enter grade for subject " + i + " (0.0 - 4.0): ");
            double grade = scanner.nextDouble();

            System.out.print("Enter number of units for subject " + i + ": ");
            int units = scanner.nextInt();

            // Validate input grade
            if (grade < 0 || grade > 4) {
                System.out.println("Invalid grade input. Grade should be between 0.0 and 4.0.");
                return;
            }

            totalGradePoints += grade * units;
            totalUnits += units;
        }

        double gpa = totalGradePoints / totalUnits;
        System.out.println("Computed average grade (GPA): " + gpa);

        if (gpa >= 3.0) {
            System.out.println("Congratulations! You have passed.");
        } else {
            System.out.println("Sorry, you have failed.");
        }

        scanner.close();
    }
}