class Box_7 {
    double width;
    double height;
    double depth;

    //Constructor method
    Box_7 (double h, double w, double d) {
        width = w;
        height = h;
        depth = d;
        
    }

    //display volume
    double volume() {
        return width * height * depth;
    }
}

    class DemoBox7 {
        public static void main(String[] args) {
        Box_7 mybox1 = new Box_7(10, 20, 5);
        Box_7 mybox2 = new Box_7(5, 15, 30);
        double vol;

    //get volume of mybox1
    vol = mybox1.volume();
    System.out.println("Volume of mybox1 is " + vol);

    //get volume of mybox2
    vol = mybox2.volume();
    System.out.println("Volume of mybox2 is " + vol);
        }
    }