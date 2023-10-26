import java.util.*;

class Vehicle {
    int passengers;
    int fuelcap;
    int mpg;

    int range() {
        return mpg * fuelcap;
    }

}

class VehicleTypeMethod {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();
        int range1, range2;

        // assign value to fields in minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // assign value on sportscar
        sportscar.passengers = 4;
        sportscar.fuelcap = 20;
        sportscar.mpg = 25;

        range1 = minivan.range();
        System.out.println("Minican can carry " + minivan.passengers + " at " + range1 + " miles. ");

        range2 = sportscar.range();
        System.out.println("Sportscars can carry " + sportscar.passengers + " at " + range2 + " miles. ");
    }
}