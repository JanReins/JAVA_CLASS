public class methodPractice_2 {
    static int age_cal(int year, int birth_year) {
        return (year - birth_year);
    }

    public static void main(String[] args) {
        System.out.println("Your are is: " + age_cal(2023, 1999));
    }
}