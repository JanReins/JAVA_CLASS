public class methodPractice {
    static void f_method(String username, int level) {
        System.out.println("My username is:" + username);
        System.out.println("Character level: " + level);
    }

    public static void main(String[] args) {
        f_method("Overlord", 100);
        f_method("PKiller", 59);

    }
}