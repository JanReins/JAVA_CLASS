import java.util.*;

public class Factorial1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    int number = input.nextInt();;

    // fatorial of a number
    long fac = 1;
    for(int i = 1; i <= number; i++) 
    {
        fac = fac * i;
    }
    System.out.println(fac);
    }
 }