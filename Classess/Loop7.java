public class Loop7 {
    public static void main(String[] args) {

        int ctr1 = 1;
        int increment = 0;

        while (ctr1 <= 46) {
            System.out.println(ctr1);
            increment += 1;
            ctr1+=(increment);
        }
        
    }
}