public class Line{
    private Point beg;
    private Point end;

    public Line() {}

    public Line(Point p1, Point p2) {
        beg = p1;
        end = p2;
    }

    public Point getBeg() {
        return beg;
    }

    public void setBeg(Point p1) {
        beg=p1;
        
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point p2) {
        end=p2;
    }

    @Override
    public String toString() {
        return "Line{" + "beg=" + beg + ", end=" + end + '}';
    }

    public int lineType() {
        int type;
        if (beg.getX() == end.getX())
        type = 1;
        else if (beg.getY() == end.getY())
    }
}

public static void main(String[] args) {
    Line l1 = new Line(new Point(2,2)), new Point(2,-4);
    if(type == 1)
    System.out.println("Vertical");
    else if(type == 2)
    System.out.println("Horizontal");
    else
    type =3;
    return type;
}