public class Box2 {
    double width;
    double height;
    double depth;

    //display volume
    void volume() {
        System.out.print("Volume is ");
        System.out.println(width * height * depth);
    }
}

class BoxDemo2 { 
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        // aasign value to mybox1 instance variable
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        // aasign value to mybox1 instance variable
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        vol = mybox1.width * mybox1.height * mybox1.depth;
        System.out.println("Volume is " + vol);

        vol = mybox2.width * mybox2.height * mybox2.depth;
        System.out.println("Volume is " + vol);
    }
}