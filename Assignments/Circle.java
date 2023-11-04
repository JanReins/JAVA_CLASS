import java.lang.Math;

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

public class Circle {
    private Point center;
    private float radius;

    public Circle(Point center, float radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "Circle with center " + center + " and radius " + radius;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Circle circle = (Circle) obj;
        return Float.compare(circle.radius, radius) == 0 && center.equals(circle.center);
    }

    public static void main(String[] args) {
        Point center1 = new Point(0, 0);
        Point center2 = new Point(2, 3);

        Circle circle1 = new Circle(center1, 5);
        Circle circle2 = new Circle(center2, 3);

        System.out.println("Area of circle1: " + circle1.calculateArea());
        System.out.println("Circumference of Circle1: " + circle1.calculateCircumference());
        System.out.println("Circle1 Details: " + circle1);

        System.out.println("Area of Circle2: " + circle2.calculateArea());
        System.out.println("Circumference Circle2: " + circle2.calculateCircumference());
        System.out.println("Circle2 Details: " + circle2);

        System.out.println(circle1.toString());
        System.out.println("Are circle1 and circle2 equal? " + circle1.equals(circle2));
    }
}
