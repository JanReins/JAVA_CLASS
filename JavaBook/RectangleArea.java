class RectangleArea {
    double width;
    double length;

    RectangleArea(double w, double l) {
        width = w;
        length = l;
    }

    double AreaCal() {
        return width * length;

    }

}

class Rectangle1 {
    public static void main(String[] args) {
        RectangleArea myrect1 = new RectangleArea(10, 30);
        double area;

        area = myrect1.AreaCal();
        System.out.println(area);
    }

    
}

