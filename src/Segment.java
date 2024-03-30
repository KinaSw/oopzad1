public class Segment {
    private Point startPoint;
    private Point endPoint;

    public Segment(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public Point getStartPoint() {
        return startPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public double length() {
        return Math.sqrt(Math.pow(endPoint.x - startPoint.x, 2) + Math.pow(endPoint.y - startPoint.y, 2));

    }
    public String toSvg(){

        return "<line x1='" + this.startPoint.x + "' y1='" + this.startPoint.y +                "' x2='" + this.endPoint.x + "' y2='" + this.endPoint.y +"' stroke='black' />";
    }

    public static Segment[] perpendicularSegments(Segment segment, Point point){
        double dx = segment.endPoint.x - segment.startPoint.x ;
        double dy = segment.endPoint.y - segment.startPoint.y;
        double  new_dx1=-dy;
        double new_dy1=dx;
        double  new_dx2=dy;
        double new_dy2=-dx;
        double endx1 = point.x + new_dx1;
        double endy1 = point.x + new_dy1;
        double endx2 = point.x + new_dx2;
        double endy2 = point.x + new_dy2;
        Point first_end = new Point(endx1,endy1);
        Point second_end = new Point(endx2,endy2);
        Segment first = new Segment(point, first_end);
        Segment second = new Segment(point, second_end);
        return new Segment[]{first, second};

    }
}

