public class Box3 {
    double width;
    double height;
    double depth;

    //display volume
    double volume() {
        System.out.print("Volume is ");
        System.out.println(width * height * depth);
    }
}

class DemoBox3 {
    public static void main(String[] args) {
        Box3 mybox1 = new Box3();
        Box mybox2 = new Box3();

        //assign value to mybox1 instance 
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        //assigns different values to mybox2 instance variables
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        //diplay volume of mybox1
        mybox1.volume();

        //display volume of mybox2
        mybox2.volume();
    }
}