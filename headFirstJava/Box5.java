class Box5 {
    double width;
    double height;
    double depth;

    //Constructor method
    Box5 () {
        System.out.println("Constructor Box");
        width = 10;
        height = 10;
        depth = 10;
    }

    //display volume
    double volume() {
        return width * height * depth;
    }
}

    class DemoBox5 {
        public static void main(String[] args) {
        Box5 mybox1 = new Box5();
        Box5 mybox2 = new Box5();
        double vol;

    //get volume of mybox1
    vol = mybox1.volume();
    System.out.println("Volume of mybox1 is " + vol);

    //get volume of mybox2
    vol = mybox2.volume();
    System.out.println("Volume of mybox2 is " + vol);
        }
    }