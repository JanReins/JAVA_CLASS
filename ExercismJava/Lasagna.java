public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        int expectedMinutesInOven = 40;
        return expectedMinutesInOven;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int numbersOfMinutes) {
        int expectedMinutesInOven = 40;
        return expectedMinutesInOven - numbersOfMinutes;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int numberOfLayers) {
        return numberOfLayers * 2;
        
    }
    

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int numberOfLayers, int numberOfMinutesInOven) {
        int preparationTime = preparationTimeInMinutes(numberOfLayers);
        return preparationTime + numberOfMinutesInOven;
        
        
    }

}
