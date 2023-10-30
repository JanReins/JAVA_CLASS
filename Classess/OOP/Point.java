public class Point {
    private int x;
    private int y;

    // constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //getter
    public int getY() {
        return y;
    }

    public int getX()  {
        return x;
    }

    // sEtter
    public  void setY(int y) {
        this.y = y;

    }

    public void setX(int x) {
        this.x = x;

    }

    //toString overide`
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        Point otherPoints = (Point) obj;
        return x == otherPoints.x && y == otherPoints.y;
    }

    //return method
    public int sum() {
        return x + y;
    }

    public static void main(String[] args) {
    Point point1 = new Point(6, 5);
    Point point2 = new Point(2, 6);

    //print Point objects
    System.out.println(point1);
    
    //return sum method
    int result = point1.sum();
    System.out.println(result);

    //print toString overide
    System.out.println(point1.getX());
    
    //print equals method
    System.out.println("Are the points equal? " + point1.equals(point2));

    }

}


