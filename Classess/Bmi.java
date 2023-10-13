import java.util.Scanner;
public class Bmi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double bmi;

        System.out.println("Enter BMI: ");
        bmi = input.nextInt();

        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi < 24.5) {
            System.out.println("Normal");
        } else if (bmi >= 24.5 && bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}