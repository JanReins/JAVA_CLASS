class Cylinder {
    private Circle circle;
    private float height;

    public Cylinder(Circle circle, float height) {
        this.circle = circle;
        this.height = height;
    }

    public Circle getCircle() {
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public double calculateSurfaceArea() {
        double circleArea = circle.calculateArea();
        double lateralSurfaceArea = 2 * Math.PI * circle.getRadius() * height;
        return 2 * circleArea + lateralSurfaceArea;
    }

    public double calculateVolume() {
        return circle.calculateArea() * height;
    }

    @Override
    public String toString() {
        return circle + ", " + height;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Cylinder cylinder = (Cylinder) obj;
        return circle.equals(cylinder.circle) && Float.compare(cylinder.height, height) == 0;
    }

    public static void main(String[] args) {
        Point center = new Point(0, 0);
        Circle baseCircle1 = new Circle(center, 5);
        Circle baseCircle2 = new Circle(center, 3);

        Cylinder cylinder1 = new Cylinder(baseCircle1, 10);
        Cylinder cylinder2 = new Cylinder(baseCircle2, 7);

        System.out.println("Surface Area of Cylinder 1: " + cylinder1.calculateSurfaceArea());
        System.out.println("Volume of Cylinder 1: " + cylinder1.calculateVolume());

        System.out.println("Surface Area of Cylinder 2: " + cylinder2.calculateSurfaceArea());
        System.out.println("Volume of Cylinder 2: " + cylinder2.calculateVolume());


        System.out.println(cylinder1.toString());
        System.out.println(cylinder2.toString());
        System.out.println("Are cylinder1 and cylinder2 equal? " + cylinder1.equals(cylinder2));
    }
}
