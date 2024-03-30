public class Main {
    public static void main(String[] args) {
       
                Segment segment = new Segment(new Point(0,0),new Point(100,100));
                System.out.println(segment.toSvg());
                Segment[] segments = Segment.perpendicularSegments(segment,new Point(100/2,100/2));
                System.out.println(segment.length());
                System.out.println(segments[0].toSvg());
                System.out.println(segments[1].toSvg());
                System.out.println(segments[0].length());
                System.out.println(segments[1].length());

                Point[] pointsArray = {new Point(50, 50), new Point(50, 20), new Point(100, 20),new Point(100, 50)};
                Polygon polygon = new Polygon(pointsArray);
                System.out.println(polygon.toSvg());

    }

}
