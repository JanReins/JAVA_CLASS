// Car class with encapsulation
class Car {
    private String model;
    private int year; 
    
    // Constructor to initialize Car object with model and year
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }
    
    // Getter method to access the model of the car
    public String getModel() {
        return model;
    }
    
    // Setter method to modify the model of the car
    public void setModel(String model) {
        this.model = model;
    }
    
    // Getter method to access the year of the car
    public int getYear() {
        return year;
    }
    
    // Setter method to modify the year of the car
    public void setYear(int year) {
        this.year = year;
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating a Car object using the constructor
        Car car = new Car("Toyota", 2022);
        
        // Accessing and modifying car properties using getters and setters
        System.out.println("Car Model: " + car.getModel()); // Accessing model using getter
        System.out.println("Car Year: " + car.getYear());   // Accessing year using getter
        
        car.setModel("Honda"); // Modifying model using setter
        car.setYear(2021);     // Modifying year using setter
        
        System.out.println("Updated Car Model: " + car.getModel()); // Accessing updated model
        System.out.println("Updated Car Year: " + car.getYear());   // Accessing updated year
    }
}
