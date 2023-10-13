public class GalToLit {

    public static void main (String[] args) {

        double gallon, liter;
        int counter;

        counter = 0;
        for (gallon = 1; gallon <= 100; gallon++) {
            liter = gallon * 3.7854;
            System.out.println(gallon + " gallon is " + liter +" liter");
            
            counter++;
            if (counter == 10) {
                System.out.println();
                counter = 0;
            }

        }

        
          


        }
    }