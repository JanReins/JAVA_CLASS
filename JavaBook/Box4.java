public class Box4 {
    double width;
    double height;
    double depth;

    //display volume
    double volume() {
        return width * height * depth;
    }
}

class DemoBox4 {
    public static void main(String[] args) {
        Box4 mybox1 = new Box4();
        Box4 mybox2 = new Box4();
        double vol;

        //assign value to mybox1 instance 
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        //assigns different values to mybox2 instance variables
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        // get volume of mybox1
        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is " + vol);

        //get volume of mybox2
        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is " + vol);
    }
}