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

    public int length() {

    }

    /*public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        Rectangle rectangle = (rectangle) obj;
        return upperleft == rectangle.upperleft*/


    public int length() {

    }


    

    }



