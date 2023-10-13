import java.util.Scanner;
public class YearCode {
    public static void main(String[] args)
    Scanner input = new Scanner(System.in);
    int year;
    System.out.print("Enter a year: ");
    
    year = input.nextInt();
    
    if (year == 1) {
        System.out.println("Freshmen");
    } else if (year == 2) {
        System.out.println("Sophomore");
    } else if (year == 3) {
        System.out.println("Sophomore");
    } else if (year == 4) {
        System.out.println("Senior");
    } else {
        System.out.println("Error");
    }

}