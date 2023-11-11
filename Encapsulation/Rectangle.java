public class Rectangle{
    private Point upperleft;
    private Point lowerright;

    //constructor
    public Rectangle(Point upperleft, Point lowerright) {
        this.upperleft = upperleft;
        this.lowerright = lowerright;
    }

    public Point getUpperleft() {
        return upperleft;
    }

    public void setUpperleft(Point upperleft) { 
        this.upperleft = upperleft;
    }

    public Point getLowerright() { 
        return lowerright;
    }

    public void setLowerright(Point lowerright) { 
        this.lowerright = lowerright;
    }
    
    public String toString() {
        return  "(" + upperleft + "," + lowerright + ")";
    } 


    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass()!= obj.getClass()) return false;

        Rectangle rectangle = (Rectangle) obj;
        return upperleft.equals(rectangle.upperleft) && lowerright.equals(rectangle.lowerright);
    }
    public int length() {
        int length = lowerright.getX() - upperleft.getX();
        return length;
    }

    public int width() {
       int width = lowerright.getY() - upperleft.getY();
       return width;
    }

    public int area() {
        int area = length()* width();
        return area;
    }

    public int perimeter() {
        int perimeter = 2*(length() + width());
        return perimeter;

}

public static void main(String[] args) {
    Point upperleft = new Point(-1, -2);
    Point lowerright = new Point(-3, 4)

    Rectangle rectangle = new Rectangle(upperleft, lowerright);

    System.out.println("length: " + rectangle.length())
    System.out.println("width: " + rectangle.width())
    System.out.println("area: " + rectangle.area())
    System.out.println("perimeter: " + rectangle.perimeter())
}

}