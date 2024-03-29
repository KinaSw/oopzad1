public class Segment {
    private Point p1;
    private Point p2;

    Segment(Point p1, Point p2){
        this.p1=p1;
        this.p2=p2;
    }
    public double length(){
    return Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
    }

    public Point getP1() {
        return p1;
    }
    public Point getP2() {
        return p2;
    }
}
