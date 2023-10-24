public class BoxDemo3 {
    double width;
    double height;
    double depth;

    //display volume
    void volume() {
        System.out.print("Volume is ");
        System.out.println(width * height * depth);
    }
}

class BoxDemo3 {
    public static void main(String[] args) {
        BoxDemo3 mybox1 = new Box();
        BoxDemo3 mybox2 = new Box();

        //assign value to mybox1 instance variables

        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        //assigns different values to mybox2 instance variables
        mybox2.width = 3;
        mybox2.width = 6;
        mybox2.width = 9;

        //diplay volume of mybox1
        mybox1.volume();

        //display volume of mybox2
        mybox2.volume();
    }
}