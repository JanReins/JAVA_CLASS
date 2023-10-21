import java.util.*;
public class Factorial2 {
    public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      
      int number = input.nextInt();
      long fac = 1;
      long i =0;
     
     for (i = 1; i <= number; i++) {
         fac= fac * i;
         
     }

      System.out.println(fac);
    }
}